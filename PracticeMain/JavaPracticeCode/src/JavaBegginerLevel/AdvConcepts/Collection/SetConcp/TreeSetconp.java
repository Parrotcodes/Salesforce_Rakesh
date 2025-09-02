package JavaBegginerLevel.AdvConcepts.Collection.SetConcp;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//TreeSet (Sorted Order)
public class TreeSetconp {
    static void main() {
        Set<Integer> nums = new TreeSet<>();
        nums.add(10);
        nums.add(10); //duplicate
        nums.add(2);
        nums.add(40);
        nums.add(30);
        nums.add(0);

        System.out.println(nums);
    }
}
