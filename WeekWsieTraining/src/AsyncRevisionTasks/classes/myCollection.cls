public class myCollection {
	//storing - same type of information together
	//1.List
	//2.Sets
	//3.Maps
	//
	
    //1.List --> use: stores ordered & same type of data, duplicates allowed---------(dynamic storage) 
    //Note:In APex Arrays is same as List
    public List<Integer> num;
    public List<Integer> num2;
    
    public myCollection() { //constructor
        num =new List<Integer>();
        num.add(10);
        num.add(20);
        num.add(10);
 
        num2 =new List<Integer>{1,2,3,4,5};         
     }
    
    public void displayListInfo(){
        System.debug(num);
        System.debug(num2);
        System.debug('Index[0]: '+num[0]);//accessing with Index (Similar to Array)
        System.debug('List Size: '+num2.size());

    }

//Uniqueness of sObjects in APex

    //2.Sets -Methods: add, remove, clone, isEmpty, clear, size
    // Note: Duplicates not allowed.
    public void myNewSet(){
        Set<Account> mySet = new Set<Account>();
    
        Account acc = new Account(Name='abc',NumberOfEmployees=1000);
        Account acc2 = new Account(Name='abcd',NumberOfEmployees=1000);
        Account acc3 = new Account(Name='abc',NumberOfEmployees=1000); // duplicate not allowed eventhough new reference, In Apex it checks the parameter field values to verify duplicates
        Account acc4 = new Account(Name='abc'); //allowed bcz it will consider -> NumberofEmployess=null
        
        mySet.add(acc);
        mySet.add(acc2);
        mySet.add(acc3);//duplicate
        mySet.add(acc4);
        
        System.debug(mySet);
        
        for(Account a: mySet){
            System.debug(a.Name+ a.NumberOfEmployees);
        }
        
        System.debug(mySet.size());//3  
    }

    
    //3.Map - put, putAll, get,values, clone, keySet,containsKey, isEmpty, size, remove,
    public void myMap(){
       // Map<OnlyPrimitiveDataTypeAsKey,AnyObjectORTypeAsValue> mmap = new Map<OnlyPrimitiveDataTypeAsKey,AnyObjectORTypeAsValue>();
       //key - primitive
       //value - primitve, sObjects, Apex objects, and other collections
       //
       Map<Integer,String> newMap = new Map<Integer,String>();
       Map<Integer,String> newMap2 = new Map<Integer,String>{1=>'map1',2=>'map2',3=>'map3'};
       
       newMap.put(1,'Ram');
       newMap.put(2,'Ram2');
       newMap.put(3,'Ram3');
        
        System.debug(newMap);
        System.debug(newMap2);
        
        newMap.put(3,'newRam'); //override and replace
        System.debug('Updated Name: '+newMap);
        newMap.putAll(newMap2); //overidding all
        System.debug(newMap);
        
        //Storing Map values(Strings) into List
        List<String> n = new List<String>();
        n = newMap.values();
        System.debug('Only Names: '+n); //list of names
        
        for(String i : n){
            System.debug('List Loop: '+ i);
        }
       
    }
}