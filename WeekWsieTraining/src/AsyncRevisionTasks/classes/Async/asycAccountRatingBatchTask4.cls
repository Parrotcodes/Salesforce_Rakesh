global class asycAccountRatingBatchTask4 implements Database.Batchable<sObject>{
    global Database.QueryLocator start(Database.BatchableContext bcx){
        //get all records
        return Database.getQueryLocator([select id, name, Rating, AnnualRevenue from Account where AnnualRevenue != null]);
    }
    
    
    global void execute(Database.BatchableContext bcx, List<Account> records){
        List<Account> accountList = new List<Account>();
        
        for(Account acc: records){
            if(acc.AnnualRevenue > 1000000){
                acc.Rating = 'Hot';
            }else if(acc.AnnualRevenue >= 500000){
                acc.Rating = 'Warm';
            }else{
                acc.Rating = 'Cold';
            }
            
            accountList.add(acc);
        }
        
        
        update accountList;
    }
    
    
    global void finish(Database.batchableContext bcx){
        System.debug('batch job completed successfully!');
    }
    
}


//execute
//asycAccountRatingBatchTask4 batchJob = new asycAccountRatingBatchTask4();
//Database.executeBatch(batchJob);