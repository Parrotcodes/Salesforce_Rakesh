global class asyncDay2Task1 implements Database.Batchable<SObject> {
    global Database.QueryLocator start(Database.BatchableContext bc) {
        // get records older than 3 days
        Date pastDate = System.today().addDays(-3);
        return Database.getQueryLocator([select Id, Status, Priority, CreatedDate from case where Status != 'Closed' AND CreatedDate < :pastDate]);
    }

    global void execute(Database.BatchableContext bc, List<case> records) {
        for (Case c : records) {
            c.Priority = 'High';
        }
        update records;
    }

    global void finish(Database.BatchableContext bc) {
        System.debug('case priority coompleted usig bathc Apex!');
    }
}