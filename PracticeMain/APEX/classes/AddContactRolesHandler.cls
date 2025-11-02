public class AddContactRolesHandler {
        public static void createContactRoles(Set<Id> oppIds) {
            //all opp
             Map<Id, Opportunity> oppMap = new Map<Id, Opportunity>([select Id, AccountId FROM Opportunity where Id IN :oppIds]);
            
            //all opp account ids store 
            Set<id> accountIds = new Set<id>();
            for (Opportunity opp : oppMap.values()) {
                    accountIds.add(opp.AccountId);
                }
            
	       //all ids of contact of opp
            Map<Id, List<Contact>> accountToContacts = new Map<Id, List<Contact>>();
            //String query = '';
            
            for(Contact con : [select id, AccountId from Contact where AccountId  IN :accountIds]){
					                
            }

        
        //checking if exists
        //create new opp contactrole
        //insert into db
        
        }


}