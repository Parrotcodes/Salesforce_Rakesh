trigger tiggernewMap on Account (before update) {
        //3.trigger.newMap
        //avaible -> beforeUpdate,afterinsert,afterupdate,afterUndelete Triggers
        
    Map<Id,Account> nmap = new Map<Id,Account>();
    nmap = trigger.newMap;
    
    //list of contacts associated with Account id's
    List<Contact> cList = [select lastname,AccountId,MailingCity from contact where AccountId in :nmap.keySet()];
    
    //Modifying the Contacts based on Account info
    for(Contact c:cList){
        Account ac =nmap.get(c.AccountId);
        c.MailingCity =ac.BillingCity;        
    }
    
    update cList;
}