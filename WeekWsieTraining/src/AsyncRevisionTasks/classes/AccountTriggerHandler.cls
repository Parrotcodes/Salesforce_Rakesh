public class AccountTriggerHandler {
//case 9: If an Account with Industry Agriculture and Type Prospect is updated and ownership is set to private, do not allow user to set this ownership

    public static void handleisBeforeUpdateActivities(List<Account> newAccoutsList, Map<Id,Account> oldAccoutsListMap){ 
        //case 9
        for(Account newRecord : newAccoutsList){
            if(newRecord.Industry == 'Agriculture' && newRecord.Type == 'Prospect'){
                if(oldAccoutsListMap.get(newRecord.Id).Ownership != newRecord.Ownership && newRecord.Ownership == 'Private'){
                    newRecord.addError('you can not modify the record ownership to private');
                }
            }
        }
	}
    
    public static void handleisAfterInserteActivities(List<Account> newAccountCon){
        //case 11
        List<Contact> contactList = new List<Contact>();
        for(Account acc : newAccountCon){
            if(acc.Create_N_Contacts__c != null){
                for(Integer i=1;i<=acc.Create_N_Contacts__c;i++){
                    Contact newcontact = new Contact();
                    newcontact.LastName = acc.Name +' User '+i;
                    newcontact.AccountId = acc.id;
                    newcontact.Description = 'Creatd via Trigger using N contacts filed values';      
                    
                    contactList.add(newcontact);
                }
            }
        }
        
        if(!contactList.isEmpty()){
            insert contactList;
        }
    }
    
    public static void handleisAfterUpdateActivities(List<Account> newAccoutRecords, Map<id,Account> oldMapAccoutsRecords){
        //case 10        
        Map<id,String> updatedAccountList = new Map<id,String>();        
        
        for(Account newRecord : newAccoutRecords){
            if(oldMapAccoutsRecords.get(newRecord.Id).Website != newRecord.Website){
                updatedAccountList.put(newRecord.Id, newRecord.Website);
            }
        }
        
        if(updatedAccountList.keySet().size()>0){
            List<Contact> updatedList = new List<Contact>();
            List<Contact> conList = [SELECT Website__c, AccountId, LastName, Id FROM Contact where AccountId IN : updatedAccountList.keyset()];
            
            for(Contact con : conList){
                con.Website__c = updatedAccountList.get(con.AccountId);
                updatedList.add(con);                
            }
            
            if(updatedList.size()>0){
                update updatedList;
            }
        }
    }
    
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