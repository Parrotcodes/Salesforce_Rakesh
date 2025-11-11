public with sharing class withSahring {
    public static void getAccounts() {
        List<Account> accList = [SELECT Id, Name, OwnerId FROM Account];
        System.debug('Accounts visible to current user: ' + accList);
    }
}