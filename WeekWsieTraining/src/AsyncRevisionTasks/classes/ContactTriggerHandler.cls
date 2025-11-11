public class ContactTriggerHandler {
    public static void handleContactTriggerisBeforeInsert(List<Contact> newContactList){
        //case 8
        for(Contact newRecord : newContactList){
            if(newRecord.AccountId == null){
                newRecord.addError('Parent account does not exists for the contact');
            }
            
        //case 14
        List<Contact> existingRecords = [select lastname, email, phone from contact Limit 50000];
            for(Contact existingCon : existingRecords){
                if(newRecord.LastName == existingCon.LastName && newRecord.Email == existingCon.Email && newRecord.Phone == existingCon.Phone){
                    newRecord.addError('Duplicate Contact not allowed (Check: LastName, Email & Phone fileds');
                }
            }

        }
        
        
    }
    
    
}