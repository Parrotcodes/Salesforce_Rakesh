trigger asycCaseTrigger on Case (after insert) {
    if (Trigger.isAfter && Trigger.isInsert) {
        
         List<Id> caseIds = new List<Id>();
        
        for (Case c : Trigger.new) {
            caseIds.add(c.Id);
            }
        if (!caseIds.isEmpty()) {
            asycCaseTriggerHandler.createFollowUpTasksAsync(caseIds);
                }
        
    }
}