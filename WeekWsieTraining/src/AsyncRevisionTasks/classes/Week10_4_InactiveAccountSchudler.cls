global class Week10_4_InactiveAccountSchudler implements Schedulable {
    
    global void execute(SchedulableContext sc) {
        // calling my existing apex class to deactive accounts
        Week10_4_InactiveAccounts.deactivateOldAccounts();
    }
}

//schudled manuaaly by apex class schudular via Salesforce UI