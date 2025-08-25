package Week2.keyWords;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        try {
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            e.printStackTrace();
        }


        try {
            int[] arr = new int[3];
            System.out.println(arr[4]);

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("next line print");
    }
}
