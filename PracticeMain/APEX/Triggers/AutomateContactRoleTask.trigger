trigger AutomateContactRoleTask on Opportunity (after insert,after update) {
        Set<Id> oppIdsToProcessData = new Set<Id>();

    //IsInsert
    if(Trigger.isInsert){
        System.debug('after insert');
        
        for(Opportunity opp : Trigger.new){
            if(opp.StageName == 'Closed Won' && opp.AccountId != null){
                oppIdsToProcessData.add(opp.Id);
            }
        }
    }
    
    //IsUpdate
    if(Trigger.isUpdate){
        System.debug('after update');
        
         for(Opportunity oldOpp : Trigger.new){
            if(oldOpp.StageName == 'Closed Won' && oldOpp.StageName != 'Closed Won' && oldOpp.AccountId != null){
                oppIdsToProcessData.add(oldOpp.Id);
            }
         }
    }

        //HandlerClass
        AddContactRolesHandler.createContactRoles(oppIdsToProcessData);
}