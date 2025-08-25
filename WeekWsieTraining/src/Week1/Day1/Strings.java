package Week1.Day1;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Rakesh";
        String fullname = "Ch Rakesh";
        String bio = "I am a fresher";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        // String Name = input.next();
        // String Name = input.nextLine();

        // System.out.println("Your name is "+ Name);

        // Concatination
        // String firstname =  input.nextLine();
        // String lastname = input.nextLine();

        // String fullName = firstname+" " + lastname;

        // System.out.println("My name is full name "+fullName);

        // // length
        // System.out.println("Full name length: "+fullName.length());

        // charAt
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // compare
        String brand = "Apple";
        String brand2 = "Apple2";

        if(brand.compareTo(brand2) == 0){
            System.out.println("Both are same");
        }else{
            System.out.println("Not same");
        }
        
        // substring
        if(brand == brand2){ //equals(brand2)
            System.out.println("brand matched");
        }else{
            System.out.println("not matched brand");
        }

        String sentence = "Welcome to my store";

        System.out.println("Substring: "+ sentence.substring(8,sentence.length()));


        // Strings are immutable -- can not be change

        String s1 = "Hello";
        String s2 = s1;

        System.out.println("Before: s1 = " + s1 + ", s2 = " + s2);

        s1 = s1.concat(" World");

        System.out.println("After: s1 = " + s1 + ", s2 = " + s2);




    }
}
