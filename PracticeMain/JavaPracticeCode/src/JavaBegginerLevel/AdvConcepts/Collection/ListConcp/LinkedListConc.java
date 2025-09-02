package JavaBegginerLevel.AdvConcepts.Collection.ListConcp;

import java.util.LinkedList;
import java.util.List;

//LinkedList is good for frequent insertion/deletion.
public class LinkedListConc {
    static void main() {
        List<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);
        nums.add(2,40);

        System.out.println(nums);
        System.out.println("Index value:"+nums.get(2));

        for (int n:nums){
            System.out.println(n);
        }
    }
}
