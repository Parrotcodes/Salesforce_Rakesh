package Week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

// How would you convert an ArrayList to Array and an Array to ArrayList?
public class ArraytoArrayList {
    static void main() {
//        ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("User1");
        list.add("User2");
        list.add("User3");
        list.add("User4");

        System.out.println("ArrayList: "+list);

//        ArrayList to Array --- 1
        String[] listArr = list.toArray(new String[0]);
        System.out.println(listArr[0]);
        System.out.println("ArrayList -> Array: "+listArr.getClass().getSimpleName());

//        Array to ArrayList --- 2
        ArrayList<String> arrToList = new ArrayList<>(Arrays.asList(listArr));
        System.out.println("Array -> ArrayList: "+arrToList);

    }
}
