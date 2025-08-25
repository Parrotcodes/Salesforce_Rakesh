package Week2.keyWords;

public class tryCatchFinally {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            arr[4] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("every time i will print");
        }

        System.out.println("next line");
    }
}
