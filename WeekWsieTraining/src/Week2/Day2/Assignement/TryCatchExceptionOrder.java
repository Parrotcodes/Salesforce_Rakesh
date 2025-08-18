package Week2.Day2.Assignement;

//How should the Exception catch blocks be ordered ?
//The order of Exception catch blocks are first subclass of Exception then the superException class -- this will work perfectly

//program on try-catch, order of catch and finally block -- working
public class TryCatchExceptionOrder {
    public static void main(String[] args) {
        int i = 0;
        int j = 20;

        try {
            j = j/i;
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero: "+e);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
//            Runs always (exception occurs or not).
            System.out.println("It will execute always...");
        }

        System.out.println(j);

        System.out.println("Next line is running..");

    }
}
