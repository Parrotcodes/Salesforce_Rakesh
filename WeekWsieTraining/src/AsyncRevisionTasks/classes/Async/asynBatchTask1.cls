global class asynBatchTask1 implements Database.Batchable<sObject>{

    global Database.QueryLocator start(Database.BatchableContext bcx){
        Date twoMonthsAgo = System.today().addMonths(-2);
        
        
        return Database.getQueryLocator([select id, name, Status__c,LastModifiedDate from account where LastModifiedDate < :twoMonthsAgo 
                                         AND (Status__c = null OR Status__c != 'Inactive')]); //not active records
    }
    
    global void execute(Database.BatchableContext bcx, List<Account> records){
        //perform operations
        for(Account acc: records){
            acc.Status__c = 'Inactive'; //update to inactive
        }
        
        update records;
    }
    
    global void finish(Database.BatchableContext bcx){
        System.debug('batch process updation completed!');
    }
    
}


//Executon anonymous window
//asynBatchTask1 batch = new asynBatchTask1();
//Database.executeBatch(batch, 100); // 100 records per batch