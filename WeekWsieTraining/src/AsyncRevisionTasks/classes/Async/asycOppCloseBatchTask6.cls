global class asycOppCloseBatchTask6 implements Database.Batchable<sObject> {
    global Database.QueryLocator start(Database.BatchableContext bcx){
        //get records
        return Database.getQueryLocator([select id, name, StageName, LastModifiedDate from Opportunity where StageName = 'Negotiation/Review' AND LastModifiedDate < :System.today().addDays(-30)]);
    }
    
    global void execute(Database.BatchableContext bcx,List<Opportunity> records){
        //exectue
        for(Opportunity opp: records){
            opp.StageName = 'Closed Lost';
        }
        
        update records;
    }
    
    global void finish(Database.BatchableContext bcx){
        System.debug('old opportunities closed successfully!');
    }
    

}