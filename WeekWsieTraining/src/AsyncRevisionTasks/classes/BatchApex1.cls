global class BatchApex1 implements Database.Batchable<sObject>, Schedulable{
    
    //start -  get all the records from db
    global Database.QueryLocator start(Database.BatchableContext bc){
        return Database.getQueryLocator([Select AnnualRevenue from lead]);
    }
   
    
    //execute - writing operations to perfom logic action on execute for each batch
    global void execute(Database.BatchableContext bc,List<Lead> lList){
        for(Lead l : lList){
            if(l.AnnualRevenue == null){
                l.AnnualRevenue = 1000000;
            }
        }
        
        update lList;
    }
    
    //finish - notify msg via email or other ways
    global void finish(Database.BatchableContext bc){
        Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
        
        String[] toaddress = new String[]{'parrotrakhy@gmail.com','atrimyself@gmail.com'};
        
        mail.setToAddresses(toaddress);
        mail.setSubject('Congratualions! Your batch process completed!');
        mail.setPlainTextBody('your batch process is done. you go and realx ....') ;
        
        Messaging.sendEmail(new Messaging.SingleEmailMessage[]{mail});
    }
    	
    
    //method overloading - same name diff parameters
    global void execute(SchedulableContext sc){
        BatchApex1 leadBatch = new BatchApex1();
		Database.executeBatch(leadBatch,100);
        
    }
}


//Executing batch:
//BatchApex1 leadBatch = new BatchApex1();
//Database.executeBatch(leadBatch,100); //batch size -> 100