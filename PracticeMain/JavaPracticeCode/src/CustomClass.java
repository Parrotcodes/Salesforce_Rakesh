class MyOwnException extends RuntimeException{
    public MyOwnException(){
        System.out.println("You can not handle this exception.");
    }

    public MyOwnException(String string){
        super(string);
    }
}


class ATest{
    public static void m1() throws MyOwnException{
        throw new MyOwnException();
    }
}


public class CustomClass {
    public static void main(String[] args)   {
        int n = 10;
        int n2 = 0;
        try{
            System.out.println("test 1");
            try{
            n2 = n/n2;
            }catch (Exception ee){
                ee.printStackTrace();
            }
            System.out.println("test 2");

                ATest.m1();

            System.out.println("test 3");
        }catch (Exception e){
            System.out.println("test 4");
            e.printStackTrace();
        }
    }
}
