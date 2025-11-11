public class myClass {
	//A class in Apex is a blueprint or template that defines how an object behave (var + methods) together
	//User-Defined (Custom) -> Created by developers
	//System-Supplied (Built-in) -> Provided by Salesforce platform
	//
	
    public static void UserClass(){
        //from another class
        myUserDefinedClass calc = new myUserDefinedClass();
        System.debug('Sum: ' + calc.add(10, 20));
        System.debug('Multiply: ' + calc.mult(5, 3));
        
        
      //System supplied Class -- Run in DebugMode for Test        
      List<Account> accList = [SELECT Id, Name FROM Account LIMIT 5];
	  System.debug('Accounts: ' + accList);

        
    }

    
	    
}