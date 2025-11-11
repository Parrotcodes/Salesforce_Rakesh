//case: #1 => NO DML is required Before Trigger
trigger TaskTrigger on Task (before insert) {
    if(Trigger.isBefore){
        if(Trigger.isInsert){
            //update field status
            for(Task newTask : Trigger.new){
                System.debug('Found Task record');
                newTask.Priority = 'High'; //assignment operation (no need any DML statements)
            }
        }
    }
}