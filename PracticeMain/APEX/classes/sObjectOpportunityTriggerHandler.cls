public class sObjectOpportunityTriggerHandler {
	
    // ------------------------------------------------- isBefore Starts --------------------------------------------------------
    public void isBeforeInsert(List<Opportunity> oppList){
        //method
        for(Opportunity opp : oppList){
            
            if(Opp.Description == null){
                opp.Description = 'This Opportunity was created by Trigger'; // default description added
            }
            
            if(opp.Amount == null){
                opp.Amount.addError('Amount field should not be empty!'); //validation amount field
            }
            
            //if(opp.CloseDate < Date.today()){
              //  opp.CloseDate.addError('past dates not allowed as Close Dates.');//validate closeDate
            //}
            
            if(opp.Type == null){
                opp.Type = 'New Customer'; //adding type value before insert
            }
            
            if(opp.DeliveryInstallationStatus__c == null){
                opp.DeliveryInstallationStatus__c = 'In Progress'; //adding default value
            }
        }
    }
    
    
    public void isBeforeUpdate(List<Opportunity> oppList, Map<Id,Opportunity> oldmap){
    	//method    
        for(Opportunity opp : oppList){
            Opportunity oldOpp = oldmap.get(opp.Id); 
            
            if(opp.StageName != oldOpp.StageName){
                opp.Description = 'Before update triggered'; //changing stage satus update descrition
            }
            
            if(opp.CloseDate < Date.today()){
                opp.CloseDate = Date.today(); //prev date to current day
            }
        }    	
    }
  
    
    public void isBeforeDelete(List<Opportunity> oldList){
        //method
        for(Opportunity old : oldList){
            
            if(old.CloseDate < Date.today()){
                 System.debug('Delted Opportunity: '+old.Id);
               
            }else{
                old.addError('close date not done! Still due time is there!');
                System.debug('Still due time is there!');
            }
           
        }
    }
    
    
    //------------------------------------------------- isAfter Starts --------------------------------------------------
    public void isAfterInsert(List<Opportunity> newList){
        //method
        System.debug('New task created');
        
    }
    
    
    public void isAfterUpdate(List<Opportunity> newList, Map<Id,Opportunity> oldmap){
        //method
        System.debug('Sending Notification info');
    }

	
    public void isAfterDelete(List<Opportunity> oldOpp){
        //method
        System.debug('Cleanup things');
    }
}