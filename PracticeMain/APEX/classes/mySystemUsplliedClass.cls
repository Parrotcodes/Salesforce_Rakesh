public class mySystemUsplliedClass {
	//Uses:
	//These are built-in classes provided by Salesforce :—
        //We can directly use them without defining them yourself.
        //They help you interact with the Salesforce platform, database, and system utilities
        
    public void mySystemClass(){
        //system class: List, System.debug
        List<Account> accList = [SELECT ID,NAME FROM ACCOUNT];
    }
}