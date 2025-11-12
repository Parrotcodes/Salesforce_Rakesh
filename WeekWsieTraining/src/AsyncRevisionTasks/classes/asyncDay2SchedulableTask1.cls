global class asyncDay2SchedulableTask1 implements Schedulable {
    global void execute(SchedulableContext sc) {
        Database.executeBatch(new asyncDay2Task1(), 200);
    }
}