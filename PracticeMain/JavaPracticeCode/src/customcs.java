
//Custom Exception sometimes are very useful to Handle small small errors to identify easily and Handle easily
//when we deploy our application when an error which is not meaningful or not understable to user during RunTimeErrors.
// so make it clear understable way the errors we need our own custom exceptions

import java.util.Scanner;

class AgeValidateException extends Exception{
    public AgeValidateException(String message){
        super(message);
    }
}

public class customcs {
    public static void isAgeValidate(int age) throws AgeValidateException{
        if(age <18){
            throw new AgeValidateException("Age "+age+ " are not allowed to singup!");
        }else {
            System.out.println("Age is valid! Good to go...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age Check age_validity to Signup: ");
        Scanner sc = new Scanner(System.in);

        int myAge = sc.nextInt();

        try {
            isAgeValidate(myAge);
        }catch (AgeValidateException e){
            System.out.println("Exception Handling with Custom Exception: "+e.getMessage());
        }

        System.out.println("Program continues after handling exception...");


    }
}
