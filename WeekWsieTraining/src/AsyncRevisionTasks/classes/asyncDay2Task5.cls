global class asyncDay2Task5 implements Database.Batchable<sObject>  {
    global Database.QueryLocator start(Database.BatchableContext bc) {
        //get records
        return Database.getQueryLocator([select id, Status, ActivityDate,Description from Task where Status = 'Completed' AND ActivityDate < :System.today().addDays(-30)]);
    }

    global void execute(Database.BatchableContext bc, List<Task> records) {
        for (Task t : records) {
            t.put('Description', 'added comment becasue of completed task');
        }
        update records;
    }

    global void finish(Database.BatchableContext bc) {
        System.debug('finally Completed tasks are done.');
    }
}