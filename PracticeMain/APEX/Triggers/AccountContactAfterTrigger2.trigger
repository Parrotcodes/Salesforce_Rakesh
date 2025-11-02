trigger AccountContactAfterTrigger2 on Contact (after insert) {
    Contact c = trigger.new[0];
    Account ac = new Account();
    
    ac.Name = c.lastname +' & company';
    
    insert ac;
}