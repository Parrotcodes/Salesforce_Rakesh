global class asyncLeadAutoConvertBatchTask8 implements Database.Batchable<sObject>{
    global Database.QueryLocator start(Database.BatchableContext bcx) {
        //get records
  	return Database.getQueryLocator([select id from Lead where Status = 'Qualified' AND IsConverted = false]);
    }
    
    
    global void execute(Database.BatchableContext bcx, List<Lead> records) {
        //logic
        for(Lead l: records){
            //innerlogic
        }
    }
    
    global  void finish(Database.BatchableContext bcx){
        //finish
        System.debug('On Lead Batch process completed successfully!');
    }
}