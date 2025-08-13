package Week1.Day1;

import java.util.Scanner;

public class Assignemnts {
    
    // Assignment Q1
    private static void RevArray() {
        Scanner in = new Scanner(System.in);
        int[] arr =new int[10];
        int[] rev = new int[10];

        System.out.println("Enter 10 digits:");
        // input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            rev[i] = arr[arr.length -1 -i];
        }

        // Before Reverse
        // for (int i = 0; i < rev.length; i++) {
        //     System.out.println(arr[i]);
        // }
//        foreach
        System.out.println("Original array");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("Reversed array");
        // After Reverse
        for (int num : rev) {
            System.out.print(num+" ");
        }
    in.close();

    }
    // Assignment Q2
    public static void DiscountType(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your subscription type:(premium/normal)");
        String type = in.nextLine().trim().toLowerCase();

        System.out.println("Enter the Original Price:");
        double oprice = in.nextDouble();

        double discount = 0;

        switch (type) {
            case "premium":
                discount = 0.20;    
                break;
            case "normal":
                discount = 0.05;
                break;
            default:
                System.out.println("Invalid subscription type!");
                in.close();
        }

        // final price
        double finalPrice = oprice - (oprice*discount);
        System.out.println("Original Price: "+oprice);
        System.out.println("Discount Applied: " +(discount*100)+"%");
        System.out.println("final Price: "+finalPrice);

        in.close();

    }

    // Assignment Q3
    public static void findDuplicateCharacters(){
        String str = "Programming";

        str = str.toLowerCase();

        int[] count = new int[256];

        for (char c : str.toCharArray()) {
            count[c]++;            
        }

        // duplicate char
        for (int i = 0; i < count.length; i++) {
            if(count[i]>1){
                System.out.println((char)i);
            }
        }
    }

    public static void main(String[] args) {
        // Assignment Q1
        RevArray();

        // Assignment Q2
        DiscountType();

        // Assignment Q3
        findDuplicateCharacters();
        
        // Assignment Q4
        // Strings are immutable in Java
            // Once you create a String, it cannot be changed.
            // If you store a password in a String, it stays in the Java String pool or heap memory until garbage collection happens — and you can’t erase it manually.
            // This means the password might present in memory for an unknown amount of time, vulnerable to memory leakage tools.
    }
}
