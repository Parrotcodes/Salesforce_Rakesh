// Schedulable 2
global class asyncDay2SchedulableTask2 implements Schedulable {
    global void execute(SchedulableContext sc) {
        Database.executeBatch(new asyncDay2Task2(), 200);
    }
}