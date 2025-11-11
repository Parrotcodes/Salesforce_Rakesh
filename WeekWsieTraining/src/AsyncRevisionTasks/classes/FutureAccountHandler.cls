public class FutureAccountHandler {
    
    @future
    public static void updateAccountDescriptions(List<Id> accountIds){
        //fetch all account ids
        List<Account> accountList = [select id from account where id IN : accountIds];
        
        for(Account acc: accountList){
            acc.Description = 'updated this from futre method after creating a new account';
        }
        
        update accountList;
    }
    
}