global class asyncDay2Task4 implements Database.Batchable<SObject> {
    global Database.QueryLocator start(Database.BatchableContext bc) {
        //get records
        return Database.getQueryLocator([select id, Status, LastModifiedDate from Lead 
                                         where Status NOT IN ('Closed - Converted', 'Closed - Not Converted') AND LastModifiedDate < :System.today().addDays(-30)]);
    }

    global void execute(Database.BatchableContext bc, List<Lead> scope) {
        //logic
        for (Lead l : scope) {
            l.Status = 'Cold';
        }
        
        update scope;
    }

    global void finish(Database.BatchableContext bc) {
        //finish
        System.debug('Inactive leads marked as Cold.');
    }
}