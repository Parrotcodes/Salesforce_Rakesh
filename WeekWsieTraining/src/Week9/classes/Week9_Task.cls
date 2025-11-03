public class Week9_Task {

    public static void handleAfterInsert(List<Account> newAccounts) {
        List<Contact> contactsToInsert = new List<Contact>();
        List<Task> tasksToInsert = new List<Task>();

        for (Account acc : newAccounts) {
            if (acc.Industry == 'Bussiness') {

                // --- creating 3 default contadcts ---
                contactsToInsert.add(new Contact(
                    FirstName = 'Sales',
                    LastName = 'Manager',
                    Email = 'salesmanager@example.com',
                    AccountId = acc.Id // id exists bcz it's after insert operation
                ));

                contactsToInsert.add(new Contact(
                    FirstName = 'Support',
                    LastName = 'Lead',
                    Email = 'supportlead@example.com',
                    AccountId = acc.Id
                ));

                contactsToInsert.add(new Contact(
                    FirstName = 'Finance',
                    LastName = 'Officer',
                    Email = 'financeofficer@example.com',
                    AccountId = acc.Id
                ));

                // --- creating new Welcome Task after Account creates ---
                tasksToInsert.add(new Task(
                    Subject = 'Welcome Task',
                    WhatId = acc.Id, // represents the object 
                    OwnerId = acc.OwnerId,
                    Status = 'Not Started',
                    Priority = 'Normal',
                    Description = 'Welcome this new business account and initiate onboarding.'
                ));
            }
        }

        // DML outside loop to Save Governor limits
        if (!contactsToInsert.isEmpty()) {
            insert contactsToInsert;
        }

        if (!tasksToInsert.isEmpty()) {
            insert tasksToInsert;
        }
    }
}