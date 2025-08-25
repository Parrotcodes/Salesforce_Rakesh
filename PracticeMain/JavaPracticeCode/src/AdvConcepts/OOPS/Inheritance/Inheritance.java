package AdvConcepts.OOPS.Inheritance;

//we can reuse features of Super/Parent class -- without rewrite code again and again
public class Inheritance {
    public static void main(String[] args) {
//Calc
//        SuperAdvCal c = new SuperAdvCal();
        ProCal c = new ProCal();

//        Basic Cal
        System.out.println("Sum: "+c.add(3.0,4.0));
        System.out.println("Subtraction: "+c.sub(4.0,2.0));

//        Advance Cal
        System.out.println("Multiply: "+c.mul(3,4));
        System.out.println("Division: "+c.div(4,4));

//        superAdv Cal
        System.out.println("Square: "+c.square(5));
        System.out.println("Cube: "+c.cube(2));

//        Pro Cal -- Inherits all the Classes
        System.out.println("Power: "+c.power(5,3));
    }
}
