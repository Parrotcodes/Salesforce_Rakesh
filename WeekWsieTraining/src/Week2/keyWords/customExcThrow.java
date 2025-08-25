package Week2.keyWords;

//custom Exception
class AgeValidationChecker extends RuntimeException{
    public AgeValidationChecker(String msg){
        super(msg);
    }
}

public class customExcThrow {
    public static void isAgevalid(int age){
        if (age<18){
            throw new AgeValidationChecker("Your age is invalid");
        }
        System.out.println("Your age valid!");
    }
    public static void main(String[] args) {
        try {
            isAgevalid(80);
        }catch (AgeValidationChecker e){
            System.out.println("Catch Handling: "+e);
        }
    }
}
