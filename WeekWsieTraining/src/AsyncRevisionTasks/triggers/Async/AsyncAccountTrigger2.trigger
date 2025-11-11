trigger AsyncAccountTrigger2 on Account (after update) {
    if (Trigger.isAfter && Trigger.isUpdate) {
        
        Set<Id> changedAccIds = new Set<Id>();

        // Compare new and old values of Status__c
        for (Account newAcc : Trigger.new) {
            Account oldAcc = Trigger.oldMap.get(newAcc.Id);
            if (newAcc.Status__c != oldAcc.Status__c) {
                changedAccIds.add(newAcc.Id);
            }
        }

        // Call async method if any records have changed
        if (!changedAccIds.isEmpty()) {
            AsyncAccountHandler2.updateContactStatusAsync(new List<Id>(changedAccIds));
        }
    }
}