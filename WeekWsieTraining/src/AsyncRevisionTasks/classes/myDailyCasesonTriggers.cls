public class myDailyCasesonTriggers {
	// 1. When a task is created, set priority to High (Trigger: TaskTrigger.apxt)
	// 2. Whenever lead record is updated, Set the lead status to working-contracted (Trigger: LeadTrigger.apxt)
	// 3. Whenever a Case is created & Case origin is Phone, Set Priority as High, else set Priority as Low
	// 4. Whenever lead is updated and Industry is HealthCare, Set Lead Source Purchased List, SIC Code as 1100, Primary as Yes
	// 5. Whenever an Opportunity is Closed Won, create a Task for the Opportunity Owner to Split the Revenue among the team with high priority
	// 6. As Soon as Lead Record is created, create a Task for the Lead Owner to follow up with the Customer
	// 7. If Opportunity StageName is modified, update Opp AMount based on Probability * Expected Revenue
	// 8. If a contact is created without a parent Account, do not allow user to create the contact record
	// 9. If an Account with Industry Agriculture and Type Prospect is updated and ownership is set to private, do not allow user to set this ownership
	// 10. Every time an account website is updated, update the website field on all child contacts for the account
	// 11. Lead should not delete when status is 'Work-Contacted'
	// 12. Create N Contacts associated with new Account while creating Using N contact filed exists on Account
	// 13. Create a task once Opportuinty delted and assign the ownership to the Opportunity OWner
	// 14. Check if Contact record exists with same Lastname, email, phone. If so, don not allow to create a new Contact
	// 15. As soon as Opportunity is Closed Lost, remove all Opportunity Team members from Opportunity
}