public class ScheduledNightlyOrderProcessor implements Schedulable {
     public void execute(SchedulableContext sc) {
        //pending order query
         System.enqueueJob(new ProcessOrderQueueable()); //passing pending order id's as param
    }

}