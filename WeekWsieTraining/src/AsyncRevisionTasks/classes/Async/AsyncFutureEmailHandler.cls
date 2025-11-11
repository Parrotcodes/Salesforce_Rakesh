public class AsyncFutureEmailHandler {

    @future
    public static void sendNewEmail(List<String> emailList){
        List<Messaging.SingleEmailMessage> allEmails = new List<Messaging.SingleEmailMessage>();

        for(String email : emailList){
            Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
            mail.setToAddresses(new String[] {email});
            mail.setSubject('Welcome to my company!');
            mail.setPlainTextBody('Hello, welcome to our Comapny, Your contact is creaetd!');
            
			allEmails.add(mail);
        }
        
        //sending
        Messaging.sendEmail(allEmails);

    }

}