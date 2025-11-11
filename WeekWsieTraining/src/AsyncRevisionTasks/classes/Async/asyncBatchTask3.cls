//Find all Lead records where Status = 'Closed - Not Converted' and delete them in batches.
global class asyncBatchTask3 implements Database.Batchable<sObject> {

    // Fetch Leads to delete
    global Database.QueryLocator start(Database.BatchableContext bc) {
        return Database.getQueryLocator([select Id, Name, Status from Lead where Status = 'Closed - Not Converted']);
    }

    //Delete leads
    global void execute(Database.BatchableContext bc, List<Lead> scope) {
        try {
            delete scope; // Bulk delete operation
        } catch (Exception e) {
            System.debug('Error deleting leads: ' + e.getMessage());
        }
    }

    global void finish(Database.BatchableContext bc) {
        System.debug('delette completed successfully.');
    }
}