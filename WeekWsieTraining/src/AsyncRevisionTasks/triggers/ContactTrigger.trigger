trigger ContactTrigger on Contact (before insert) {
    if(Trigger.isBefore && Trigger.isInsert){
        ContactTriggerHandler.handleContactTriggerisBeforeInsert(Trigger.new); //case 8
    }
}