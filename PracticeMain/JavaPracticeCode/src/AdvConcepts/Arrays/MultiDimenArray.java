package AdvConcepts.Arrays;

public class MultiDimenArray {
    public static void main(String[] args) {
//        MultiDimensional Array
//        int nums[][] = new nums[3][3]
        int nums[][] = {{1,2,3},{3,4,5},{5,6,7}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
