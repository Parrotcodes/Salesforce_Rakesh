trigger sObjectAccuntTrigger on Account (before insert,before update,before delete,after insert,after update,after delete,after undelete) {
    
        sObjectAccuntTriggerHandler handler = new sObjectAccuntTriggerHandler();

 //Notes:
 //tirgger.new => avaible in (before insert, before update,after undelete)
 //trigger.newMap => avaible in (before update, after insert, after update, after undelete)
 //
 //trigger.old => avaible in (before update, after update, before delete, after delete)
 //trigger.oldMap => availble in (before update, after update, before delete, after delete)
    //before starts
    if(trigger.isBefore){
        if(trigger.isInsert){
            System.debug('before insert');
            //Accountmethods.isBeforeInsert();            
        }
        else if(trigger.isUpdate){
            System.debug('before update');
        }
        else if(trigger.isDelete){
            System.debug('before delete');
        }
        //before ends
        //after starts
    }
    else if(trigger.isAfter){
        if(trigger.isInsert){
            System.debug('afer insert');
        }
        else if(trigger.isUpdate){
            System.debug('after update');
        }
        else if(trigger.isDelete){
            System.debug('after delete');
        }
        else if(trigger.isUnDelete){
            System.debug('after undelete');
        }
    }
    //after ends
    //
    //
    
    
    if(Trigger.isBefore){
        if(Trigger.isInsert){
            handler.beforeInsert(Trigger.new);
        }
        else if(Trigger.isUpdate){
            handler.beforeUpdate(Trigger.new, Trigger.oldMap);
        }
        else if(Trigger.isDelete){
            handler.beforeDelete(Trigger.old);
        }
    }
    else if(Trigger.isAfter){
        if(Trigger.isInsert){
            handler.afterInsert(Trigger.new);
        }
        else if(Trigger.isUpdate){
            handler.afterUpdate(Trigger.new, Trigger.oldMap);
        }
        else if(Trigger.isDelete){
            handler.afterDelete(Trigger.old);
        }
        else if(Trigger.isUndelete){
            handler.afterUndelete(Trigger.new);
        }
    }
}