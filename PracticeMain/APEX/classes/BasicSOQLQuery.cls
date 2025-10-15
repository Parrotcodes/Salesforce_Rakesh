public class BasicSOQLQuery {
    public static void getRecords(){
        List<Account> accounts = [SELECT Id, Name FROM Account];

        for(Account acc : accounts){
            System.debug('Account: ' + acc.Name );
        }

        
    }

}