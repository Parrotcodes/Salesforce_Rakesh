global class asyncDay2Task3 implements Database.Batchable<SObject> {
    
   global Database.QueryLocator start(Database.BatchableContext bc) {
        //get records
        return Database.getQueryLocator([select Id, name, email, Phone from contact where Phone = null]);
    }

    
    global void execute(Database.BatchableContext bc, List<Contact> scope) {
        //logic
        for (Contact con : scope) {
            System.debug('User Contact missing phone: ' + con.Name + ' (' + con.Email + ')');
        }
    }

    global void finish(Database.BatchableContext bc) {
        //finish
        System.debug('using async batch missing phone contact searching completed.');
    }
}