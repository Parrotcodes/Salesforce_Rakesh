//Case #3: Whenever a Case is created & Case origin is Phone, Set Priority as High, else set Priority as Low
trigger CaseTrigger on Case (before insert, before delete) {
    
    if(Trigger.isBefore && Trigger.isDelete){
        CaseTriggerHandler.handleBeforeDeleteActivities(Trigger.OLD);
    }
    
    if(Trigger.isBefore && Trigger.isInsert){
        for(Case newCase : Trigger.new){
            if(newCase.Origin == 'Phone'){
                newCase.Priority = 'High';
            }else{
                newCase.Priority = 'Low';
            }
        }
    }
}