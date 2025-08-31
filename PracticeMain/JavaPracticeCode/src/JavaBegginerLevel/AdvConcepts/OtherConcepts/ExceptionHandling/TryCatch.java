package JavaBegginerLevel.AdvConcepts.OtherConcepts.ExceptionHandling;

//Exception Handling
//If any Error with the Logic or code it will stop execution of code.It will not run next lines of code too.
// To handle the error and run the next lines we need Exception Handling Concept
// we can resolve such type of errors with -- try,catch,throw,throws,finally
public class TryCatch {
    public static void main(String[] args) {
        int x =100;
        int y = 10;

        int nums[]= new int[5];

        //try-catch //multiple-catch
        try {
            int result = x/y;
            System.out.println(result);
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }catch (ArithmeticException e){
            System.out.println("Number can not divisible by zero.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your array size is outoff bound. check the length of array");
        }catch (Exception e){ // always last catch
            System.out.println("Something went wrong!"+e);
        }

        System.out.println("Next line is running..");
    }
}
