package JavaBegginerLevel.AdvConcepts.Collection.SetConcp;

import java.util.HashSet;
import java.util.Set;

//A Set is a collection that does not allow duplicates.
//HashSet does not guarantee order.
public class HashsetConcp {
    static void main() {
        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(10); //duplicate
        nums.add(2);
        nums.add(40);
        nums.add(30);
        nums.add(0);

        System.out.println(nums);
    }
}
