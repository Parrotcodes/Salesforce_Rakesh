//Case #5 : Whenever an Opportunity is Closed Won, create a Task for the Opportunity Owner to Split the Revenue among the team with high priority
trigger OpportunityTrigger on Opportunity (before update, after update) {
    if(Trigger.isBefore && Trigger.isUpdate){
        System.debug('New: '+Trigger.new);
        System.debug('Old: '+Trigger.old);
        //case 7
        //OpportunityTriggerHandler.handleActivitiesisBeforeUpdate(Trigger.new,Trigger.old);
         OpportunityTriggerHandler.handleActivitiesisBeforeUpdate(Trigger.new,Trigger.oldMap); 
    }
    
    if(Trigger.isAfter && Trigger.isUpdate){
        //classHandler - case 5 & Case 15
        OpportunityTriggerHandler.handleActivitiesisAfterUpdate(Trigger.new);
        
       
        }
    
    
}