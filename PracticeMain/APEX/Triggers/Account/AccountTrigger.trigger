trigger myAccountTrigger on Account(before insert,before update, before delete, after insert,after update,after delete,after undelete){
   
   if (Trigger.isBefore) {
        if(Trigger.isInsert){
            Account acc = new Account();
            acc = trigger.new[0];
            acc.Name = 'Test Account';
            insert acc;
        }
   }else if (Trigger.isAfter) {
    
   }
    
}