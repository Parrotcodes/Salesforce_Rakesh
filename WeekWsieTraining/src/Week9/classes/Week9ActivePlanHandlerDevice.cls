public class Week9ActivePlanHandlerDevice {

    // This method updates the Current Active Plan on each related Account.
    public static void updateCurrentActivePlan(List<iNetwork_Device__c> newList, List<iNetwork_Device__c> oldList) {
        
        // 1. Collect all related Account IDs from both new and old device records.
        Set<Id> accountIds = new Set<Id>();

        if (newList != null) {
            for (iNetwork_Device__c device : newList) {
                if (device.Account__c != null) {
                    accountIds.add(device.Account__c);
                }
            }
        }

        if (oldList != null) {
            for (iNetwork_Device__c device : oldList) {
                if (device.Account__c != null) {
                    accountIds.add(device.Account__c);
                }
            }
        }

        // If there are no Accounts to process, stop here.
        if (accountIds.isEmpty()) {
            return;
        }

        // 2️, Query all active devices that belong to these Accounts.
        List<iNetwork_Device__c> activeDevices = [
            SELECT Id, Name, Device_Status__c, Account__c, Account__r.Name
            FROM iNetwork_Device__c
            WHERE Device_Status__c = 'Active'
            AND Account__c IN :accountIds
        ];

        // 3️. Map each Account to its active device name (the current plan).
        Map<Id, String> accountToActivePlan = new Map<Id, String>();

        for (iNetwork_Device__c device : activeDevices) {
            // If multiple active devices exist, last one will overwrite (can customize this logic)
            accountToActivePlan.put(device.Account__c, device.Name);
        }

        // 4️. Prepare list of Accounts to update
        List<Account> accountsToUpdate = new List<Account>();

        for (Id accId : accountIds) {
            // If Account has an active plan, set it; else, clear the field
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

        // 5️. Update all Accounts safely inside a try-catch block
        if (!accountsToUpdate.isEmpty()) {
            try {
                update accountsToUpdate;
                System.debug('Accounts updated successfully with their current active plan.');
            } catch (Exception e) {
                System.debug('Error while updating Accounts: ' + e.getMessage());
            }
        }
    }
}