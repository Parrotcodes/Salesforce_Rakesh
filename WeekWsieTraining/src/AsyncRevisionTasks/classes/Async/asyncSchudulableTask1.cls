global class asyncSchudulableTask1 implements Schedulable {
		//two ways we can perform action 
		//    1. with schudlue automate by schudle time
		//    2. with trigger based on event insert/update should run this batch method
    global void execute(SchedulableContext sc){
        //scheudling
        //Example
        asyncMyBatchClass batch = new asyncMyBatchClass();
		Database.executeBatch(batch);

        //Task1
        //Update all Account records that haven’t been modified in the last 2 months (set Status = 'inactive').
        asynBatchTask1 batch2 = new asynBatchTask1();
        Database.executeBatch(batch2, 100); //default size 200
        
        
        //Task2
        
    }
}