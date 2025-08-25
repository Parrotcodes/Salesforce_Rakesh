package Week2.keyWords;

public class tryMulipleCatch {
    public static void main(String[] args) {
        try {
            int[] a = new int[3];
            a[1] = 3/0;
            System.out.println(a[4]);
        }catch (ArithmeticException e){
            System.out.println("Arthmatic: "+e);
        }catch (NullPointerException e){
            System.out.println("NullPointer: "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutofBound: "+e);
        }catch (Exception e){
            System.out.println("Reaming Exceptions Handled: "+e);
        }finally {
            System.out.println("All above exceptions are closed");
        }

        System.out.println("Next line code is running .....");
    }
}
