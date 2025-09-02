package Week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    static void main() {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("Orginal ArratList: "+nums);

//        Revese array -- swap
        int leftIndex =0;
        int rightIndex = nums.size()-1;

        while (leftIndex<rightIndex){
            int temp= nums.get(leftIndex);
            nums.set(leftIndex ,nums.get(rightIndex));
            nums.set(rightIndex,temp);

            leftIndex++;
            rightIndex--;
        }

        System.out.println("Reversed ArrayList: "+ nums);


    }
}
