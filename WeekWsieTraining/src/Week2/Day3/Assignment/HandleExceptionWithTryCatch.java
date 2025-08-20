package Week2.Day3.Assignment;

public class HandleExceptionWithTryCatch {
    public static void main(String[] args) {
        int x =10;
        int y  =20;
        int result =0;

        try { //throws the exceptions
            result = x/y; // if something goes wrong with Logic/error --> catch will handle that error
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){ //handles the exceptions thrown by 'try'
            System.out.println("Zero can not divisible by Zero.");
            System.out.println(e);
        }catch (Exception e){
            //other than Arthematic Exception this catch will Handle those Exceptions by the superCalss Exception
            System.out.println("Something went wrong! "+e);
        }

        //after-handling exception program won't stop running it will read next line program without interruption
        System.out.println("Next line is Running.........after Handling exceptions");
    }
}
