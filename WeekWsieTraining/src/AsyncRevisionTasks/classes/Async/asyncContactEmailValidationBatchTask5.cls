global class asyncContactEmailValidationBatchTask5 implements Database.Batchable<sObject>{
    global Database.QueryLocator start(Database.BatchableContext bcx){
        //get records
        return Database.getQueryLocator([select Id, Email from Contact where Email != null]);
    }
    
    global void execute(Database.BatchableContext bcx,List<Contact> records){
        //logic 
        //List<Contact> validEmailsList = new List<Contact>();
        
        for(Contact con: records){
            //pattern copied
            if(!Pattern.matches('^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$', con.Email)){
                con.validEmail__c = false;
            }else{
                con.validEmail__c	= true;
            }
        }
        
        update records;
        
    }
    
    
    global void finish(Database.BatchableContext bcx){
        //finish
        System.debug('batch process validation completed successfully !');
    }

}

//execute
//asyncContactEmailValidationBatchTask5 batch5 = new asyncContactEmailValidationBatchTask5();
//Database.executeBatch(batch5);