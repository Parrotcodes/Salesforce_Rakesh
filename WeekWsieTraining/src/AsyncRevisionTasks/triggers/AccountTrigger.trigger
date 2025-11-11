Trigger AccountTrigger on Account(before Update,after insert, after update){
    if(Trigger.isBefore && Trigger.isUpdate){
    // case 9: If an Account with Industry Agriculture and Type Prospect is updated and ownership is set to private, do not allow user to set this ownership
        AccountTriggerHandler.handleisBeforeUpdateActivities(Trigger.new,Trigger.oldMap);
    }
    
    if(Trigger.isAfter && Trigger.isInsert){
        //case 12: create N contacts associate with Account using Account filed
        AccountTriggerHandler.handleisAfterInserteActivities(Trigger.new);
    }
    
    if(Trigger.isAfter && Trigger.isUpdate){
        //case 10: Every time an account website is updated, update the website field on all child contacts for the account
        AccountTriggerHandler.handleisAfterUpdateActivities(Trigger.new,Trigger.oldMap);
    }
    
    System.debug('is updating before is delete');
  if(Trigger.isDelete){
    System.debug(Trigger.isDelete);
}
    System.debug('is delete after');
}