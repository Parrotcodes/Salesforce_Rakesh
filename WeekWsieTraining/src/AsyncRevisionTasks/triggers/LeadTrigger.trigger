//case: #2 => NO DML is required Before Trigger
//Whenever lead record is updated, Set the lead status to working-contracted
//Case: #4 - Whenever lead is updated and Industry is HealthCare, Set Lead Source Purchased List, SIC Code as 1100, Primary as Yes
//Case: #6 - As Soon as Lead Record is created, create a Task for the Lead Owner to follow up with the Customer
trigger LeadTrigger on Lead (before update,after insert, before delete) {
    if(Trigger.isBefore && Trigger.isDelete){
        LeadTriggerHandler.handleActivitiesisBeforeDelete(Trigger.OLD);
    }
    if(Trigger.isAfter && Trigger.isInsert){
        LeadTriggerHandler.handleActivitiesisAfterUpdate(Trigger.new);
    }
    if(Trigger.isBefore && Trigger.isUpdate){
		System.debug('Found Lead record');
        
        for(Lead newLead: Trigger.new){
            //case 2
            newLead.Status = 'Working-Contacted';
            
        	//case 4
            if(newLead.Industry == 'Healthcare'){
                newLead.LeadSource = 'Purchased List';
                newLead.SICCode__c = '1100';
                newLead.Primary__c = 'Yes';
            }
        }
        
    }	
}