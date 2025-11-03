trigger Week9Task_iNetworkDeviceTriggerActive on iNetwork_Device__c (
    after insert, after update, after delete, after undelete
) {
    // This trigger runs after any change to iNetwork_Device__c records.
    // It ensures that the related Account (Customer) always shows the current active plan.

    // Create lists for new and old records (depending on the context)
    List<iNetwork_Device__c> newList = (Trigger.isInsert || Trigger.isUpdate || Trigger.isUndelete) ? Trigger.new : null;
    List<iNetwork_Device__c> oldList = (Trigger.isUpdate || Trigger.isDelete) ? Trigger.old : null;

    // Call the handler method to update Account with current active plan
    Week9ActivePlanHandlerDevice.updateCurrentActivePlan(newList, oldList);
}