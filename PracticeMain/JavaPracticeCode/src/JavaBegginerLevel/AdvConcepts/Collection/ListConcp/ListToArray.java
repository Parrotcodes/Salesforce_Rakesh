package JavaBegginerLevel.AdvConcepts.Collection.ListConcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

//    List<String> n = new ArrayList<>(); (recommended)
//    ArrayList<String> n = new ArrayList<>();

//    users = new Vector<>(); //data will loose
//    users = new Vector<>(users); // data remains same even-though we changed the ListType Array to Vector
//    System.out.println(users);

//        List (recommended) - Provides flexibility: You can change the implementation later without affecting the rest of your code.
//                              Makes your code more readable and maintainable.
//        Use List<String> n = new ArrayList<>(); → 95% of the time (flexible, cleaner).
//        Use ArrayList<String> n = new ArrayList<>(); → only when you need ArrayList-specific methods
public class ListToArray {

    static void main() {
    List<String> users = new ArrayList<>();
    users.add("Rakesh");
    users.add("Jhon");
    users.add("Boss");

    System.out.println(users); //list

    String[] user = users.toArray(new String[0]);
    System.out.println(Arrays.toString(user));
    for (String u:user){
        System.out.println(u); //array
    }



    }
}
