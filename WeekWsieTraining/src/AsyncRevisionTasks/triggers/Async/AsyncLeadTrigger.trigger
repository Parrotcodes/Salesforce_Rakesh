trigger AsyncLeadTrigger on Lead (after insert) {
    if(Trigger.isAfter && Trigger.isInsert){
        
    }
}