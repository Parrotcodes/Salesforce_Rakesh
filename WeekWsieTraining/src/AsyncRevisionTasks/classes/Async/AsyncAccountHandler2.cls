public class AsyncAccountHandler2 {
    
    @future
    public static void updateContactStatusAsync(List<Id> accountIds) {
        
        Map<Id, Account> accMap = new Map<Id, Account>([select Id, Status__c from Account where Id IN :accountIds]
        );

        // contasList
        List<Contact> contactsToUpdate = new List<Contact>();

        for (Account acc : accMap.values()) {

	//reated contacts for the account            
            List<Contact> relatedContacts = [select Id, Description from Contact where AccountId = :acc.Id];
            
            for (Contact con : relatedContacts) {
                con.Description = 'Your account status is updated to: ' + acc.Status__c;
                contactsToUpdate.add(con);
            }
        }

		//before update check the list is empty or not
        if (!contactsToUpdate.isEmpty()) {
            update contactsToUpdate;
        }
    }
}