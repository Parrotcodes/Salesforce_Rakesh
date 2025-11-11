public without sharing class withoutShariing {
    public static void getAccounts() {
        List<Account> accList = [SELECT Id, Name, OwnerId FROM Account];
        System.debug('All Accounts visible: ' + accList);
    }
}

//NOte: By default if we not mentioned anything - It runs without sharing if called from an Apex trigger or system context.
//inherits the sharing setting of the class that called it. (inherited sharing)