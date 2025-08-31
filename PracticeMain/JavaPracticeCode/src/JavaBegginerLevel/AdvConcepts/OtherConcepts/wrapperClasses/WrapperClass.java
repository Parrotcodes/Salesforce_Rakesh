package JavaBegginerLevel.AdvConcepts.OtherConcepts.wrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {
//        int - Integer as a Class
//        char - Character
//        double - Double

        int num = 19;
//        Integer n1 = new Integer(num); // storing a primitive value inside the wrapper object --> Boxing
        Integer n2 = num; // converted to object automatically -- autoboxing

        System.out.println(n2);

//        int n3 = n2.intValue(); // object type to primitive type -- unboxing
        int n4 = n2;
        System.out.println(n4); // converted object to primitive automatically -- autoUnboxing

        String newNum = "10";
        int nNum = Integer.parseInt(newNum);
        System.out.println(nNum * 2);
    }
}
