trigger week9TaskAccountTrigger on Account (after insert) {
    if (Trigger.isAfter && Trigger.isInsert) {
        Week9_Task.handleAfterInsert(Trigger.new);
    }
}