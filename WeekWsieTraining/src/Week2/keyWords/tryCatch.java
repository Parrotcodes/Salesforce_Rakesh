package Week2.keyWords;

public class tryCatch {
    public static void main(String[] args) {
        int num = 10;
        try {
             num = 10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(num);
        System.out.println("next line");
    }
}
