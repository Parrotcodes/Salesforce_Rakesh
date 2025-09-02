package JavaBegginerLevel.AdvConcepts.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
//        Map <Key,value>
//        Map<String,Integer> students = new HashMap<>(); // normal hashMap
        Map<String,Integer> students = new Hashtable<>(); // synchronized version of map

        students.put("Rakesh",20);
        students.put("Harry",22);
        students.put("Mani",25);
        students.put("Jhon",10);

//        printing map
        System.out.println("MAP: "+students);

//        get the set of keys
        System.out.println("Keys: "+students.keySet());

//        get the values with key --> accessing using just like index value
        System.out.println("Accessing using Key(index): "+students.get("Rakesh"));

//        get the list of values
        System.out.println("Values: "+students.values());

//        looping all the key : value pairs
        System.out.println("----Looping Maps-----");
        for (String key:students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
}
