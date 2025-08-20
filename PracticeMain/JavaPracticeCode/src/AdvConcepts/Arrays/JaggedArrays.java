package AdvConcepts.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; //jaggedArray Size is diff for diff row

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random()*10);
            }
        }

        for(int m[]:nums){
            for (int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
