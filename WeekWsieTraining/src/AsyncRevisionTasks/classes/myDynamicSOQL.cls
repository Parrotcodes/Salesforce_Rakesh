public class myDynamicSOQL {
    public static void myDynamic(){
        //dynamically creating query string
        String q = 'Select id';
        
        List<String> fieldList = new List<String>();
        fieldList.add('Name');
        fieldList.add('NumberOfEmployees');
        fieldList.add('Phone');
        
        String objName = 'Account';
        
        for(String s: fieldList){
            q += ','+s;
        }
        
        q += ' from '+objName;
        
        List<sObject> lists = Database.query(q);
        
        //Final Query
        String squery = 'Select Name, NumberOfEmployees,PhoneNumber from Account'; 
        //no filed present-> PhoneNumber get QueryExeception
        
    }
}