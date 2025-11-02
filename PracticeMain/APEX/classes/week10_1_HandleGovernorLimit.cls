public class week10_1_HandleGovernorLimit {
    //wrong way: (DML insdie loop)
    //for (Integer i = 0; i < 200; i++) {
        //Account acc = new Account(Name = 'Test Account ' + i);
        //insert acc; // This performs 200 DML statements → Limit exceeded!
	//}

    //solution bulkified
    public static void insertAccounts(Integer totalRecords) {
        List<Account> accList = new List<Account>();
        
        for (Integer i = 0; i < totalRecords; i++) {
            accList.add(new Account(Name = 'Test Account ' + i));
        }

        // Single DML operation - bulk insert
        insert accList;
        System.debug('Inserted ' + accList.size() + ' Accounts successfully!');
    }

}
//AccountInsertHandler.insertAccounts(200);