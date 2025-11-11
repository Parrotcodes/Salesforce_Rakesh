trigger AccountAfterInsertTrigger on Account (after insert) {

    if(Trigger.isAfter && Trigger.isInsert) {
        // method
        AccountTriggerHandler.createContactsAndTasks(Trigger.new);
    }
}