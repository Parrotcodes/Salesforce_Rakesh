package Basics.Loops;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for (int n[]: nums){
            for (int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
