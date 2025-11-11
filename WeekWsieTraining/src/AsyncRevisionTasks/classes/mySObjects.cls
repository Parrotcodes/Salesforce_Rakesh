public class mySObjects {
	//to represent a single record into the salesforce database - (sObject - Standard Object)
    public static void myObjects(){
        //----------Standard object----------
        //two ways we can create sObject record 
        //1.through Constructor
        //2.dot notation with object represention
        //
        //Create a Account
        Account newacc = new Account(Name='Samsung'); // 1
        newacc.Name = 'Amazon'; //2
        
        //-----Custom Object-------------------------
        //create a custom object	
        //Demo__c dt1 = new Demo__c(name__c = 'dummy custom object');
        //
        
        //-------Generic Objects---------------------
        //referecing sObect with standard object
        sObject s1 = new Account(Name='Genric');
        //s1.Name = 'new Name'; //will not work with generic
        //s1.put(Name='new Name'); //this will work
        
    }
}