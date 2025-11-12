global class asyncDay2SchedulableTask5 implements Schedulable {
    global void execute(SchedulableContext sc) {
        Database.executeBatch(new asyncDay2Task5(), 100);
    }
}