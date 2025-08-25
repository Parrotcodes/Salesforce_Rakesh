package Week2.keyWords;



public class ThrowsCallingMethods {
    public static void methodA() throws Exception{
        //throws will go to caller Exception
        throw new Exception("Error handled from MethodA");
    }

    public static void methodB() throws Exception{
        //just declare not handling
    methodA();
    }

    public static void methodC(){
        try {
            methodB();
        } catch (Exception e) {
            //Handling Exception
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        methodC();
        System.out.println("running...");
    }
}
