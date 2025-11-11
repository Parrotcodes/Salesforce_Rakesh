public class AsyncAPexCheatsheet {
    
    //Future Method
    @future(callout=true)
    public static void sendEmailAsync(String email) {
        // run asynchronously
    }


    //Queueable Apex
    public class SendEmailQueueable implements Queueable {
        public void execute(QueueableContext context) {
            // logic
            // we can run -> System.enqueueJob(new SendEmailQueueable());

        }
    }
    
    //Batch Apex
    
    

}