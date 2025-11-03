trigger Week9Task_PorperContextiNetworkDeviceTrigger on iNetwork_Device__c (after insert, after update, after delete, after undelete) {
    // 🧠 This trigger ensures that whenever a Device record changes,
    // the related Account’s Current Active Plan field is updated properly.

    // Declare lists for new and old records based on trigger context.
    List<iNetwork_Device__c> newList = new List<iNetwork_Device__c>();
    List<iNetwork_Device__c> oldList = new List<iNetwork_Device__c>();

    // ✅ If records are inserted
    if (Trigger.isInsert) {
        System.debug('🔥 Trigger fired after INSERT');
        newList = Trigger.new;
    }
    // ✅ If records are updated
    else if (Trigger.isUpdate) {
        System.debug('🔥 Trigger fired after UPDATE');
        newList = Trigger.new;
        oldList = Trigger.old;
    }
    // ✅ If records are deleted
    else if (Trigger.isDelete) {
        System.debug('🔥 Trigger fired after DELETE');
        oldList = Trigger.old;
    }
    // ✅ If records are undeleted (restored from recycle bin)
    else if (Trigger.isUndelete) {
        System.debug('🔥 Trigger fired after UNDELETE');
        newList = Trigger.new;
    }

    // 🧩 Call handler to update the related Accounts with the correct active plan
    Week9Task_PorperContextActivePlanHandler.updateCurrentActivePlan(newList, oldList);
}