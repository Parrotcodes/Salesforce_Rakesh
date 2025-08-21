package Week2.keyWords;

class NegativeElementsException extends RuntimeException{
    public NegativeElementsException(String msg){
        super(msg);
    }
}

public class InsideLoopsThrow {
    public static void checkArrayNums(int[] arr){
        for(int n:arr){
            if (n<0){
                throw new NegativeElementsException("Negative values can not be accessed!");
            }
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,6,0,-3,5,9};

        try {
            checkArrayNums(nums);
        }catch (NegativeElementsException e){
            System.out.println("catch Handled: "+e);
        }
    }
}
