trigger AsyncContactTrigger on Contact (after insert) {
    //list of contact emails
    List<String> emailList = new List<String>();
    
    if(Trigger.isAfter && Trigger.isInsert){
        for(Contact newContact : Trigger.new){ //bulkified best for importing/creating mutliple records at a time
            if(newContact.email != null){
                emailList.add(newContact.Email);
            }
            
        }
        
        if(!emailList.isEmpty()){
               AsyncFutureEmailHandler.sendNewEmail(emailList);
        }
    }
}