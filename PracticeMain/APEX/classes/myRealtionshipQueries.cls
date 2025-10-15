public class myRealtionshipQueries {
    public static void myRelationshipRecords(){
        // ----------------------- Relationship Queries --------------------------
        // There are 2 Types: 
        		// 1.Child-to-Parent (Dot Notation) (Note: We can go MAX upto 5 levels upward in parent relationships)
        		// 2.Parent-to-Child (Subquery) (Note: only one level down) 
        		// applicable for both standard & Custom objects 
        
        //1. Child to Parent 
        //Eg: Contact(child) ->--- Acount(parent)
       
        //standard onect
         List<contact> cont = [SELECT Id, LastName, Account.Name, Account.Industry FROM Contact WHERE Account.Industry = 'Banking'];
         
         //Custom object - we need to add (__c) at end of each field and for the object at end (__r) if its Subquery
        
        //2. Parent to Child
        //SELECT Id, Name,
  List<Account> accList =   [SELECT Id, Name, (SELECT Id, LastName, Email FROM Contacts) FROM Account WHERE Industry = 'Technology'];
    }
}