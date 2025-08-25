package Week2.keyWords;

public class throwKey {
    public static void isValidateAge(int age){
        if (age<18){
            throw new ArithmeticException("your age is  "+age);
        }
    }

    public static void main(String[] args) {
    try {
        isValidateAge(13);
    }catch (ArithmeticException e){
        System.out.println("Age Invalid: "+e);
    }

    }
}
