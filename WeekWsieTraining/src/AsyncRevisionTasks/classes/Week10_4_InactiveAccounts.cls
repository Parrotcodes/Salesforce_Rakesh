public class Week10_4_InactiveAccounts {
    public static void deactivateOldAccounts() {
        Date sixMonthsAgo = System.today().addMonths(-6);

        // Query Active Accounts and include related Tasks in the last 6 months
        List<Account> activeAccounts = [
            SELECT Id, Name, Status__c,
                (SELECT Id, ActivityDate FROM Tasks WHERE ActivityDate >= :sixMonthsAgo)
            FROM Account
            WHERE Status__c = 'Active'
        ];

        if (activeAccounts.isEmpty()) {
            System.debug('No active accounts found.');
            return;
        }

        List<Account> accountsToDeactivate = new List<Account>();

        // If the subquery returns 0 tasks then the account has no activity in last 6 months
        for (Account a : activeAccounts) {
            if (a.Tasks == null || a.Tasks.isEmpty()) {
                // ensure we set the exact picklist value that exists in your org
                a.Status__c = 'Inactive';
                accountsToDeactivate.add(a);
            }
        }

        if (!accountsToDeactivate.isEmpty()) {
            update accountsToDeactivate;
            System.debug('Deactivated ' + accountsToDeactivate.size() + ' accounts.');
        } else {
            System.debug('No accounts needed deactivation.');
        }
    }
}

// Execute: Week10_4_InactiveAccounts.deactivateOldAccounts();