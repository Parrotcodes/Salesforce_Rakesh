package JavaBegginerLevel.AdvConcepts.Collection.ListConcp;

import java.util.ArrayList;
import java.util.List;

//List maintains insertion order and allows duplicates
public class ArrayListconc {
    static void main() {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);

        System.out.println(nums);
//        System.out.println(nums[1]); //possible in array
        System.out.println("Index value 1: "+nums.get(1)); //index value

        for (int n:nums){
            System.out.println(n);
        }
    }
}
