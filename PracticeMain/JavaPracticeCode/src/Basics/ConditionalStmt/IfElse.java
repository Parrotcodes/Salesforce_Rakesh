package Basics.ConditionalStmt;

public class IfElse {
    public static void main(String[] args) {
        int x =10;

//      if-else-if
        if(x>10){
            System.out.println("x is not greater than 10");
        } else if (x==10) {
            System.out.println("x is equal to 10");
        } else {
            System.out.println("x is not less than 10");

        }

//      if-else
        if(x>0 && x<20){
            System.out.println("Yes it is in range..");
        }else {
            System.out.println("No out of range..");
        }

//      if-else
        int a =1;
        int b =0;

        if(a>b){
            System.out.println("Max value: "+a);
        }else {
            System.out.println("Min value: "+b);
        }
    }
}
