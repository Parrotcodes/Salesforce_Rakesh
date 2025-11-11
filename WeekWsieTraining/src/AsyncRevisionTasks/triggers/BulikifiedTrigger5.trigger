trigger BulikifiedTrigger5 on Lead (before insert) {
    
    //single first record
   // Lead l = Trigger.new[0];
    //l.Rating = 'warm';
    
    
    //multiple - iterate through all the leads new records
    for(Lead n:Trigger.new){
        n.Rating = 'warm';
    }
    
}