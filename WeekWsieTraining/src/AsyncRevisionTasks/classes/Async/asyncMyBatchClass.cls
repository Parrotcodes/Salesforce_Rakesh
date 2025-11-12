//schedulable 3
global class asyncMyBatchClass implements Database.Batchable<sObject> {
    
    //get the records
    global Database.QueryLocator start(Database.BatchableContext bc) {
        return Database.getQueryLocator('select Id, Name from Account');
    }

    //perform execution logic
    global void execute(Database.BatchableContext bc, List<Account> accList) {
        for(Account acc : accList) {
            acc.Description = 'Your Description updated by Batch Apex';
        }
        
        //DML to update the 
        update accList;
    }

    //finsh notify mesage
    global void finish(Database.BatchableContext bc) {
        System.debug('Updating completed for all batch files');
    }
}

//Anynomous window execution

//asyncMyBatchClass batch = new asyncMyBatchClass();
//Database.executeBatch(batch, 100);