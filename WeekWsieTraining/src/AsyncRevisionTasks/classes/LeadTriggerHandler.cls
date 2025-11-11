public class LeadTriggerHandler {
    public static void handleActivitiesisAfterInsert(){}
    
    public static void handleActivitiesisBeforeDelete(List<Lead> leads){
        for(Lead newLead : leads){
            if(newLead.Status == 'Working-Contacted'){
                newLead.AddError('you can delete this record, Status: working-contacted');
            }
        }
    }
    
    public static void handleActivitiesisAfterUpdate(List<Lead> leadList){    
        List<Task> myTasksList = new List<Task>();
        
        for(Lead newLead : leadList){
                Task newTask = new Task();
                newTask.Priority = 'High';
                newTask.OwnerId = newLead.OwnerId;
                newTask.Description = 'Follow up new Lead';
                newTask.Status = 'Not Started';
                newTask.Subject = 'Follow up';
                newTask.WhoId = newLead.Id; //which represents nonHuman Objects(Account,contact etc.)
                myTasksList.add(newTask);
  			  }
        
        if(!myTasksList.isEmpty()){
            insert myTasksList;
        }

	}
}