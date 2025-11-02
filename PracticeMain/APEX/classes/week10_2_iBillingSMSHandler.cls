public class week10_2_iBillingSMSHandler {

    @future(callout=true)
    public static void sendSMSAlerts(List<Id> billingIds) {
        // Query billing records with Account info
        List<iBilling__c> billingList = [
            SELECT Id, Name, Account__c, Account__r.Name, DueRemainingDays__c
            FROM iBilling__c
            WHERE Id IN :billingIds
        ];

        // Collect all related Account IDs
        Set<Id> accountIds = new Set<Id>();
        for (iBilling__c bill : billingList) {
            if (bill.Account__c != null) {
                accountIds.add(bill.Account__c);
            }
        }

        // Query all Contacts related to these Accounts
        Map<Id, List<Contact>> accountContactsMap = new Map<Id, List<Contact>>();
        for (Contact con : [
            SELECT Id, Name, Phone, AccountId
            FROM Contact
            WHERE AccountId IN :accountIds AND Phone != null
        ]) {
            if (!accountContactsMap.containsKey(con.AccountId)) {
                accountContactsMap.put(con.AccountId, new List<Contact>());
            }
            accountContactsMap.get(con.AccountId).add(con);
        }

        // Loop through billing records and send SMS to their contacts
        for (iBilling__c bill : billingList) {
            if (bill.DueRemainingDays__c > 10 && accountContactsMap.containsKey(bill.Account__c)) {
                for (Contact con : accountContactsMap.get(bill.Account__c)) {
                    // Simulate sending SMS (we can replace with actual SMS API later)
                    System.debug('📱 Sending SMS to Contact: ' + con.Name + ' (Phone: ' + con.Phone + ') for Account: ' + bill.Account__r.Name + ' — Your payment is pending for more than 10 days!');
                }
            }
        }
    }

    public static void processPendingPayments() {
        List<iBilling__c> overdueBills = [
            SELECT Id, Account__c, DueRemainingDays__c
            FROM iBilling__c
            WHERE DueRemainingDays__c > 10
        ];

        if (!overdueBills.isEmpty()) {
            List<Id> billingIds = new List<Id>();
            for (iBilling__c bill : overdueBills) {
                billingIds.add(bill.Id);
            }

            // Call future method
            sendSMSAlerts(billingIds);
        } else {
            System.debug('No overdue payments found.');
        }
    }
}


/*
 * Excecute Anonymous Window
     * // Step 1: Create a sample Account
    Account acc = new Account(Name = 'Test Account A');
    insert acc;
    
    // Step 2:Create two Contacts for that Account
    Contact con1 = new Contact(FirstName = 'John', LastName = 'Doe', Phone = '+919876543210', AccountId = acc.Id);
    Contact con2 = new Contact(FirstName = 'Jane', LastName = 'Smith', Phone = '+919123456789', AccountId = acc.Id);
    insert new List<Contact>{ con1, con2 };
    
    // Step 3: Create an iBilling record linked to this Account
    //created manually
    
    // Step 4: Run your process method
    week10_2_iBillingSMSHandler.processPendingPayments();

*/