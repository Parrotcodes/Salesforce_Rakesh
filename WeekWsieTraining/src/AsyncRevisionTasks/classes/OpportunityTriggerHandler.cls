public class OpportunityTriggerHandler {
    public static void handleActivitiesisAfterInsert(){}
    
    public static void handleActivitiesisBeforeUpdate(List<Opportunity> newOppList, Map<id,Opportunity> oldOppList){
      // Opportunity singleOpp = newOppList[0];
      // Opportunity singleoldOpp = oldOppList[0];
       
       // if(singleOpp.StageName != singleOldOpp.StageName){ //not bulkified - bad approach
         //   System.debug('Case 7 : modifed opp stage');
        // }
        
       // for(Opportunity newRecord : newOppList){
         //   for(Opportunity oldRecord : oldOppList){
           //     if(newRecord.Id == oldRecord.Id && newRecord.StageName != oldRecord.StageName){ //bulkified but bad approach (O(n2))
             //       System.debug('using trigger.new & old');
         		//	System.debug('Case 7 : modifed opp stage');
        		//}
        
            //}
        //}
       
         for(Opportunity newRecord : newOppList){ // best approach - bulkified , O(n)
             if(oldOppList.get(newRecord.Id).StageName !=  newRecord.StageName){
                 System.debug('using trigger.new & oldMap');
         		 System.debug('Case 7 : modifed opp stage');
                 newRecord.Amount = newRecord.Probability * newRecord.ExpectedRevenue;
             }               
    }
}
    
    public static void handleActivitiesisAfterUpdate(List<Opportunity> OppList){    
        //case 5
        List<Task> myTasksList = new List<Task>();
        
        //case 15
        List<id> listOfOppIds = new List<id>();
        for(Opportunity oppid : OppList){
            listOfOppIds.add(oppid.id);
        }
        List<OpportunityTeamMember> OppTeamList = [SELECT OpportunityId, Id FROM OpportunityTeamMember where OpportunityId IN :listOfOppIds];
        List<OpportunityTeamMember> addDeleteTeamList = new List<OpportunityTeamMember>();
        
        for(Opportunity newOpp : OppList){
            if(newOpp.StageName == 'Closed won'){
                Task newTask = new Task();
                newTask.Priority = 'High';
                newTask.OwnerId = newOpp.OwnerId;
                newTask.Description = 'split the revenue among the team';
                newTask.Status = 'Not Started';
                newTask.Subject = 'Split Revene';
                newTask.WhatId = newOpp.Id; //which represents nonHuman Objects(Account,contact etc.)
                myTasksList.add(newTask);
            }
            else if(newOpp.StageName == 'Closed Lost'){
                //case 15
                for(OpportunityTeamMember teamMember : OppTeamList){
                    if(teamMember.OpportunityId == newOpp.Id){
                        addDeleteTeamList.add(teamMember);
                    }
                }
            }
    }
        
        if(!myTasksList.isEmpty()){
            insert myTasksList;
        }
        
        if(!addDeleteTeamList.isEmpty()){
            delete addDeleteTeamList;
        }

}
}