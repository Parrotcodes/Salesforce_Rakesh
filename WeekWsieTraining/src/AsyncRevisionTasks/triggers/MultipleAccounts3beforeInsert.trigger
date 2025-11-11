trigger MultipleAccounts3beforeInsert on Account (before insert) {
    //trigger.new
    //non-bulkified
    
    //for a single record works at a time
    //Account a = trigger.new[0];
    //a.NumberOfEmployees = 1000;
    //insert ac;
    
    
    //bulkified -- muliple records works at a time
    for(Account ac : Trigger.new){
        ac.NumberOfEmployees = 1000;
    }    
}