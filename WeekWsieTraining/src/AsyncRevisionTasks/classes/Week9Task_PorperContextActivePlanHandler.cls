public class Week9Task_PorperContextActivePlanHandler {

    public static void updateCurrentActivePlan(List<iNetwork_Device__c> newList, List<iNetwork_Device__c> oldList) {

        // Collect all related Account IDs from both new and old records
        Set<Id> accountIds = new Set<Id>();

        // Add Account IDs from newList
        if (newList != null) {
            for (iNetwork_Device__c device : newList) {
                if (device.Account__c != null) {
                    accountIds.add(device.Account__c);
                }
            }
        }

        // Add Account IDs from oldList (important for delete or update)
        if (oldList != null) {
            for (iNetwork_Device__c device : oldList) {
                if (device.Account__c != null) {
                    accountIds.add(device.Account__c);
                }
            }
        }

        // Exit early if there are no Accounts to process
        if (accountIds.isEmpty()) {
            System.debug('⚠️ No related Accounts found. Exiting handler.');
            return;
        }

        // Query all active devices belonging to those Accounts
        List<iNetwork_Device__c> activeDevices = [
            SELECT Id, Name, Device_Status__c, Account__c, Account__r.Name
            FROM iNetwork_Device__c
            WHERE Device_Status__c = 'Active'
            AND Account__c IN :accountIds
        ];

        // Map each Account to its active device (the current plan)
        Map<Id, String> accountToActivePlan = new Map<Id, String>();

        for (iNetwork_Device__c device : activeDevices) {
            accountToActivePlan.put(device.Account__c, device.Name);
        }

        // Prepare a list of Accounts to update
        List<Account> accountsToUpdate = new List<Account>();

        for (Id accId : accountIds) {
            if (accountToActivePlan.containsKey(accId)) {
                accountsToUpdate.add(new Account(
                    Id = accId,
                    Current_Plan__c = accountToActivePlan.get(accId)
                ));
            } else {
                accountsToUpdate.add(new Account(
                    Id = accId,
                    Current_Plan__c = null
                ));
            }
        }

        // Update Accounts safely
        if (!accountsToUpdate.isEmpty()) {
            try {
                update accountsToUpdate;
                System.debug('✅ Accounts updated successfully with their active plan.');
            } catch (Exception e) {
                System.debug('❌ Error while updating Accounts: ' + e.getMessage());
            }
        }
    }
}