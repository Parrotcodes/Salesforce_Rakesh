package Week2.Day4.Assignment;

//Custom Exception sometimes are very useful to Handle small small errors to identify easily and Handle easily
//when we deploy our application when an error which is not meaningful or not understable to user during RunTimeErrors.
// so make it clear understable way the errors we need our own custom exceptions

import java.util.Scanner;

class AgeValidateException extends Exception{
    public static void isAgeValidate(int age){
        if(age <18){
            System.out.println("Age "+age+ " are not allowed to singup!");
        }else {
            System.out.println("Age is valid! Good to go...");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        System.out.println("Enter your age Check age_validity to Signup: ");
        Scanner sc = new Scanner(System.in);

        int myAge = sc.nextInt();

        try {
            AgeValidateException.isAgeValidate(myAge);
        }catch (Exception e){
            System.out.println("Exception Handling with Custom Exception. "+e);
        }

        System.out.println("Program continues after handling exception...");


    }
}
