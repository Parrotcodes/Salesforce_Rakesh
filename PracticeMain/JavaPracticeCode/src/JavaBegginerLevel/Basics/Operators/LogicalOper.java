package JavaBegginerLevel.Basics.Operators;

public class LogicalOper {
    public static void main(String[] args) {
//        &-AND, |-OR, !-NOT
//        &&, ||, !

        int x = 10;
        int y =34;
        int a =4;
        int b =5;

        boolean re = x>y && a>b;
        boolean re2 = x<y || a>b;
        boolean re3 = a != b;
        System.out.println(re);
        System.out.println(re2);
        System.out.println(!re2);//NOT
        System.out.println(re3);
    }
}
