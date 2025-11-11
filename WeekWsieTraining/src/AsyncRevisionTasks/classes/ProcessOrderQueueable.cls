public class ProcessOrderQueueable implements Queueable{

    public void execute(QueueableContext context) {
        //some funcation inserting invoice
        //sending email -> chaning
        System.enqueueJob(new SendEmailQueueable()); //need to pass orderIds as param to send email

    }
}