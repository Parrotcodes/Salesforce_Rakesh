trigger AsyncAccountTrigger on Account (after insert) {
    
    if(Trigger.isAfter && Trigger.isInsert){
        
        List<Id> accountIds = new List<Id>();
    
    for(Account acc : Trigger.new){
        accountIds.add(acc.id);//storing all ids
    }
    
    
    if(!accountIds.isEmpty()){
        FutureAccountHandler.updateAccountDescriptions(accountIds);
    }        
    }
    
    

    
		
}