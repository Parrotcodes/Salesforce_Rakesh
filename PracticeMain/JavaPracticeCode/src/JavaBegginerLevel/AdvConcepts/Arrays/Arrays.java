package JavaBegginerLevel.AdvConcepts.Arrays;



public class Arrays {
    public static void main(String[] args) {
//        Array stores list of values which is of same dataType
//        int nums[]= new int[4]; //fixed size (static)
        int nums[] = {10,20,30,40}; // not dynamic, but no fixed size

//        System.out.println(nums[0]);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
