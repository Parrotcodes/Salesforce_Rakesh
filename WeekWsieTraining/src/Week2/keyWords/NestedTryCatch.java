package Week2.keyWords;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
//inner try-block
            try {
                int num = 9/0;
            }catch (ArithmeticException e){
                System.out.println("Inner catch 1: "+e);
            }

//inner try-block
            try {
                String n = null;
                System.out.println(n.length());
            }catch (NullPointerException e){
                System.out.println("Inner catch 2: "+e);
            }

//outer try block
            System.out.println("outer try-block");
            int[] newarr= new int[3];
            System.out.println(newarr[5]);

        }catch (Exception e){
            System.out.println("outer catch : "+e);
        }

        System.out.println("handled exceptions");
    }
}
