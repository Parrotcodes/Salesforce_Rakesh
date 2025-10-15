public class mySOQLDemo {
    public static void myMethod(){
        //List<Integer> accList = new List<Integer>{1,2,3,4,5};
            
           // for(Integer i : accList){
             //   System.debug(i);
            //}
         
        //List<Account> accList = new List<Account>{1,2,3,4,5};
        List<Account> accList = [select name from account];
        
        for(Account i : accList){
            System.debug('Account Name: '+i.name);
        }
        
       List<AggregateResult> appList = [SELECT StageName, MAX(Amount) FROM Opportunity GROUP BY StageName];
	for (AggregateResult item : appList) {
        String stageName = (String)item.get('StageName');
        System.debug('StageName: ' + stageName);
		}

        
    }
}