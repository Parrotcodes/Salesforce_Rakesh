trigger contextVarTrigger on Contact (before insert,before update, before delete, after insert, after update, after delete, after Undelete) {
    // ------ Context variables-----------
    // 
    // 5.isInsert     true / false
    // 6.isUpdate
    // 7.isDelete
    // 8.isUnDelete
    // 9.isBefore
    // 10.isAfter
    // 11.Size  --> no.of sObject records
    
    if(trigger.isBefore){
        if(trigger.isInsert)        {
            System.debug('i am before insert');
        }
        else if(trigger.isUpdate)        {
            System.debug('i am before update');
        }
        else if(trigger.isDelete)        {
            System.debug('i am before delete');
        }
    }else if(trigger.isAfter){
         if(trigger.isInsert)        {
            System.debug('i am after insert');
        }
        else if(trigger.isUpdate)        {
            System.debug('i am after update');
        }
        else if(trigger.isDelete)        {
            System.debug('i am after delete');
        }
        
        else if(trigger.isUnDelete){
                System.debug('i am after UnDelete');
            }
    }    
    
}