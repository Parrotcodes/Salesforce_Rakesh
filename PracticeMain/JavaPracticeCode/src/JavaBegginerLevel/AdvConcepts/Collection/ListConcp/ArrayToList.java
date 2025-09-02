package JavaBegginerLevel.AdvConcepts.Collection.ListConcp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    static void main() {

//        Array of names
        String[] names = {"Java","Python", "C++"};

//        converting Array to List -- fixed size
        List<String> list1 = Arrays.asList(names);

        System.out.println("List: "+list1);

//        modifiable - dynamic list
        List<String> list2 = new ArrayList<String>(Arrays.asList(names));
        list2.add("new program");
        System.out.println("New List: "+list2);



    }
}
