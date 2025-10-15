public class myFirstvarQL {
    public static void myVar(String email){
        //SQL Varibale BINDING
        
        //static var declaration
        List<Contact> newCon = [Select id,lastname, email from contact where email='parrotrakhy@gmail.com'];
        System.debug(newCon);
        
        //dynamic varibale
        List<Contact> newCon2 = [Select id, lastname, email from contact where email=:email];
        System.debug(newCon2);
        
    }
}