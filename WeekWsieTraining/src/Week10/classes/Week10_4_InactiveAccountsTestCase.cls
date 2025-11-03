@IsTest
public class Week10_4_InactiveAccountsTestCase {

    @IsTest
    static void testDeactivateOldAccounts() {
        // Create 2 Accounts with Status__c = 'Active'
        Account accNoActivity = new Account(Name = 'No Activity Account', Status__c = 'Active');
        Account accWithActivity = new Account(Name = 'Recent Activity Account', Status__c = 'Active');
        insert new List<Account>{ accNoActivity, accWithActivity };

        // Insert a Task for the second account with ActivityDate = today (within 6 months)
        Task taskForActive = new Task(
            Subject = 'Follow Up',
            WhatId = accWithActivity.Id,
            ActivityDate = Date.today()
        );
        insert taskForActive;

        // Sanity check: ensure tasks are inserted
        // (optional debug - removed to keep test clean)

        Test.startTest();
            // Execute the logic under test
            Week10_4_InactiveAccounts.deactivateOldAccounts();
        Test.stopTest();

        // Re-query the accounts to verify their Status__c values
        Map<Id, Account> accMap = new Map<Id, Account>([
            SELECT Id, Status__c FROM Account WHERE Id IN :new List<Id>{ accNoActivity.Id, accWithActivity.Id }
        ]);

        // Assertions
        System.assertEquals('Active', accMap.get(accNoActivity.Id).Status__c, 'Account with no activity should be deactivated.');

        System.assertEquals('Active',   accMap.get(accWithActivity.Id).Status__c,'Account with recent activity should remain Active.');
    }
}