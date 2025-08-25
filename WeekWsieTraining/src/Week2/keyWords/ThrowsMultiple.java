package Week2.keyWords;

import java.io.IOException;

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

public class ThrowsMultiple {
    public static void ValidNumbers(int n) throws IOException,MyException,ArithmeticException{
        if (n==0){
            throw new ArithmeticException("Zeros are not allowed");
        }
        if (n >= 1) {
            throw new IOException("Integers are allowed");
        }else {
            throw new MyException("Negative values are not allowed");
        }
    }
    public static void main(String[] args) {
        try {
            ValidNumbers(-9);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

        System.out.println("next line is running..");
    }
}
