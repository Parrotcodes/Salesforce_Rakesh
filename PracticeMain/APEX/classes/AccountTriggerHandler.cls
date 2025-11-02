public class AccountTriggerHandler {

    public static void createContactsAndTasks(List<Account> newAccounts) {
        
        List<Contact> contactsToInsert = new List<Contact>();
        List<Task> tasksToInsert = new List<Task>();

        // loop through all new accounts
        for (Account acc : newAccounts) {
            if (acc.Type == 'Business') {
                
                // creating 3 default contacts
                contactsToInsert.add(new Contact(
                    LastName = 'Sales Manager',
                    AccountId = acc.Id, //id's exists bcz it is after insert
                    Title = 'Sales Manager'
                ));

                contactsToInsert.add(new Contact(
                    LastName = 'Support Lead',
                    AccountId = acc.Id,
                    Title = 'Support Lead'
                ));

                contactsToInsert.add(new Contact(
                    LastName = 'Finance Officer',
                    AccountId = acc.Id,
                    Title = 'Finance Officer'
                ));

                // creating a new Task
                tasksToInsert.add(new Task(
                    Subject = 'Welcome Task',
                    WhatId = acc.Id,
                    OwnerId = acc.OwnerId,
                    Status = 'Not Started',
                    Priority = 'Normal',
                    Description = 'Welcome this new business account and confirm contact details.'
                ));
            }
        }

        //insert DML
        if (!contactsToInsert.isEmpty()) {
            insert contactsToInsert;
        }

        if (!tasksToInsert.isEmpty()) {
            insert tasksToInsert;
        }
    }
}