package JavaBegginerLevel.AdvConcepts.OtherConcepts.ExceptionHandling;

class MyOwnException extends Exception{
    public MyOwnException(String string){
        super(string);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int x =100;
        int y = 0;
        int result =0;


        //try-catch //multiple-catch
        try {
            result = x/y;
            if (result==0)
                throw new MyOwnException("I don't want to print zero");

        }catch (MyOwnException e){
            result = x/1;
            System.out.println("the default output"+e);
        }catch (Exception e){ // always last catch
            System.out.println("Something went wrong!"+e);
        }

        System.out.println(result);

        System.out.println("Next line is running..");
    }
    }

