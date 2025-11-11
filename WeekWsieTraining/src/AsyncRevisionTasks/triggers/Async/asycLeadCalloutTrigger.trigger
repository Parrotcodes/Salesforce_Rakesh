trigger asycLeadCalloutTrigger on Lead (after insert) {

    if(Trigger.isAfter && Trigger.isInsert){
        List<Id> leadIds = new List<Id>();
        
        for(Lead l: Trigger.new){
            leadIds.add(l.id);
        }
        
        if(!leadIds.isEmpty()){
            FutureasycLeadCalloutHandler.FutureHandleRequest(leadIds);
        }
    }
}