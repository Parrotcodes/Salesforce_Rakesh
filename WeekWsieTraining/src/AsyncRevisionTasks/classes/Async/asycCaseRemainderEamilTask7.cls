global class asycCaseRemainderEamilTask7  implements Database.Batchable<SObject>, Database.Stateful{
    global Database.QueryLocator start(Database.BatchableContext bcx) {
        //get records
        return Database.getQueryLocator([select id, Owner.Email, Subject, Status, CreatedDate from Case where Status != 'Closed' AND
                                        CreatedDate < :System.now().addDays(-3)]);
    }
    
    global void execute(Database.BatchableContext bc, List<Case> records) {
        List<Messaging.SingleEmailMessage> emails = new List<Messaging.SingleEmailMessage>();

        //logic
        for(Case c: records){
             if (c.Owner.Email != null) {

            //passing var
            Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage();
            //cc
            email.setToAddresses(new String[] {c.Owner.Email});
			email.setSubject('My Batch remainder');
			email.setPlainTextBody('my batch remainder text body about case opens from last 3 days');
            
            emails.add(email);

            
        }
        	}
        
        //sending
            if (!emails.isEmpty()) {
            Messaging.sendEmail(emails);
        }
    }
    
    global void finish(Database.BatchableContext bcx){
        //finish
        System.debug('remaider sent for overdue cases, batch executed successfully!');
    }

}


//asycCaseRemainderEamilTask7 batch7 = new asycCaseRemainderEamilTask7();
//Database.executeBatch(batch7, 50);