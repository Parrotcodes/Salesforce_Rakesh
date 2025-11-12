global class asyncDay2Task2 implements Database.Batchable<SObject> {
    
    global Database.QueryLocator start(Database.BatchableContext bc) {
        //get records
        return Database.getQueryLocator([select Id, StageName, Probability, CloseDate from Opportunity 
                                         where StageName NOT IN ('Closed Won','Closed Lost') AND CloseDate < :System.today()]);
    }

    global void execute(Database.BatchableContext bc, List<Opportunity> records) {
        //logic
        for (Opportunity opp : records) {
            opp.Probability = 0;
        }
        update records;
    }

    global void finish(Database.BatchableContext bc) {
        //finish
        System.debug('Using apex batch opportunity problity reset!');
    }
}