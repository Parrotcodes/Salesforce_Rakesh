//All Contact records and update a custom field Age__c based on their Birthdate.
global class asynBatchTask2 implements Database.Batchable<sObject>{

 global Database.QueryLocator start(Database.BatchableContext bcx) {
        return Database.getQueryLocator([ select Id, Name, Birthdate, Age__c from Contact where Birthdate != null]);
            }           
    
    global void execute(Database.BatchableContext bc, List<Contact> records) {
        Date today = System.today();
        for(Contact con : records) {
            //storing age
            Integer age = today.year() - con.Birthdate.year();

            if (today.month() < con.Birthdate.month() || (today.month() == con.Birthdate.month() && today.day() < con.Birthdate.day())) {
                age--;
            		}

            con.Age__c = age;
        }
   update records;
  }
    
    global void finish(Database.BatchableContext bcx) {
        System.debug('batch completed successfully.');
    }
            
 }


//asynBatchTask2 batch3 = new asynBatchTask2();
//Database.executeBatch(batch3);