package AdvConcepts.Arrays;

public class ThreeDArray {
    public static void main(String[] args) {
//        3D - Array
        int nums[][][] = new int[3][3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
//                    System.out.print(nums[i][j][k]);
                    nums[i][j][k] = (int)(Math.random()*10);
                }
                System.out.println();
            }
            System.out.println();

        }

        for (int m[][]:nums){
            for(int n[]: m){
                for (int o:n){
                    System.out.print(o+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
