global class asyncDay2SchedulableTaskk4 implements Schedulable {
    global void execute(SchedulableContext sc) {
        
        Database.executeBatch(new asyncDay2Task4(), 200);
    }
}