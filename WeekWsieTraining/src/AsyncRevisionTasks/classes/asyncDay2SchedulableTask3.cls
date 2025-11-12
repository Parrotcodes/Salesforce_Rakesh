global class asyncDay2SchedulableTask3 implements Schedulable {
    global void execute(SchedulableContext sc) {
        Database.executeBatch(new asyncDay2Task3(), 200);
    }
}