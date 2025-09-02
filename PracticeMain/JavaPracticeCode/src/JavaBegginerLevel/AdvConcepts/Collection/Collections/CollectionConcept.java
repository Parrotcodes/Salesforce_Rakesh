package JavaBegginerLevel.AdvConcepts.Collection.Collections;

import java.util.*;

public class CollectionConcept {
    public static void main(String[] args) {
        //there is no index menthod for collection arrayList
//        Collection<Integer> nums = new ArrayList<Integer>();
//        List<Integer> nums = new ArrayList<Integer>(); //duplicate values allowed and shown in output
//        Set<Integer> nums = new HashSet<Integer>(); //Set --> not sorted, doesn't support index value, duplicate values not allowed and if we insert also not shown output
//        Set<Integer> nums = new TreeSet<Integer>(); //TreeSet --> sorted, doesn't support index value, duplicate values not allowed and if we insert also not shown output
        Collection<Integer> nums = new TreeSet<Integer>(); //TreeSet --> sorted, doesn't support index value, duplicate values not allowed and if we insert also not shown output
        nums.add(5);
        nums.add(15);
        nums.add(25);
        nums.add(35);
        nums.add(35);

        Iterator<Integer> values = nums.iterator();//sorted, no duplicates allowed, we need to iterate the list of elements

//        for-each will not work for Iterator to loop all elements
//        for (int n : values){
//            System.out.println(n);
//        }

        while (values.hasNext())
            System.out.println(values.next());


//        System.out.println(nums);
//        System.out.println("Index Number value: "+nums.get(1)); //get/fetch value using index number
//        System.out.println("value of index position: "+nums.indexOf(5)); //finding index number of value

//        for (int n : nums){
//            System.out.println(n);
//        }
    }

}
