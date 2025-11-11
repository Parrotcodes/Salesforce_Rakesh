trigger asyOpportunityCalloutTrigger on Opportunity (after update) {
	
    if(Trigger.isAfter && Trigger.isUpdate){
        Set<Id> myids = new Set<Id>();
        
        for(Opportunity opp : Trigger.new){
            if(opp.StageName == 'Closed Won' && Trigger.oldMap.get(opp.id).StageName != 'Closed Won'){
                myids.add(opp.id);
            }
        }
        
        if(!myids.isEmpty()){
            asyncOppCalloutHandler.NotifyToOustideSysem(new List<Id>(myids));
        }
    }
}