package Basics.Loops;

public class forLoop {
    public static void main(String[] args) {
//        for-loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello i: "+i);
        }

//        nested for-loop
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.println("Hello "+i+ " " +j);
            }
        }
    }
}
