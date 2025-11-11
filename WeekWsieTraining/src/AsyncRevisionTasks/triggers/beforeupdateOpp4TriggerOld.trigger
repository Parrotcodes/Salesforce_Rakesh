trigger beforeupdateOpp4TriggerOld on Opportunity (before update) {
    //trigger.old -> only available in update & delete
    for(Opportunity oldOpp : Trigger.old){
        for(Opportunity newOpp : Trigger.new){
            if(oldOpp.id == newOpp.id && oldOpp.Amount != newOpp.Amount){
                newOpp.Amount.addError('Amount can not be change once entered! Says Trigger :)');
            }
        }
    }
}