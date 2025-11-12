//schedulable 1
global class asycSchudulerTask1 implements Schedulable {
    global void execute(SchedulableContext sc){
        Database.executeBatch(new asynBatchTask1(),200);
    }
}