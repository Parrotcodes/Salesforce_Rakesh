package JavaBegginerLevel.AdvConcepts.Collection.SetConcp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//LinkedHashSet (Preserves Insertion Order)
public class LinkedHashSetconcp {
    static void main() {
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(10); //duplicate
        nums.add(2);
        nums.add(40);
        nums.add(30);
        nums.add(0);

        System.out.println(nums);
    }
}
