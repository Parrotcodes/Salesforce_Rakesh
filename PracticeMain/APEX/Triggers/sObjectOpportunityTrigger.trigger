trigger sObjectOpportunityTrigger on Opportunity (before insert, before update, before delete,
                                                  after insert, after update, after delete, after undelete) {
    
    //HelperClass Handler
    sObjectOpportunityTriggerHandler handler = new sObjectOpportunityTriggerHandler();
	
    // --------------------------------------- Before Trigger -------------------------------------
    if(Trigger.isBefore){
        if(Trigger.isInsert){
            System.debug('before insert sObjectOpportunityTrigger');
            handler.isBeforeInsert(Trigger.new);
        }
        else if(Trigger.isUpdate){
            System.debug('before update sObjectOpportunityTrigger');
            handler.isBeforeUpdate(Trigger.new,Trigger.oldMap);
        }
        else if(Trigger.isDelete){
            System.debug('before delete sObjectOpportunityTrigger');
            handler.isBeforeDelete(Trigger.old);
        }
    }
    
    //------------------------------- After trigger ------------------------------------------
    else if(Trigger.isAfter){
        if(Trigger.isInsert){
            System.debug('after insert sObjectOpportunityTrigger');
            handler.isAfterInsert(Trigger.new);
        }
        else if(Trigger.isUpdate){
            System.debug('after update sObjectOpportunityTrigger');
            handler.isAfterUpdate(Trigger.new, Trigger.oldMap);
        }
        else if(Trigger.isDelete){
            System.debug('after delete sObjectOpportunityTrigger');
            handler.isAfterDelete(Trigger.old);
        }
        
        //------------------------ After isUndelete -----------------------
        else if(Trigger.isUnDelete){
            System.debug('is after undelete sObjectOpportunityTrigger');
            
            
        }
    }
}