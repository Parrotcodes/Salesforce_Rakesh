package AdvConcepts.OOPS.Abstraction.Interfaces.TypesOfInterfaces;

@java.lang.FunctionalInterface
interface A{
    void show();
//    void dev();
}

//better use anonymous InnerClass -- to write the one method to reduce no.of lines of code
//class B implements A{
//    public void show(){
//        System.out.println("in B Show..extends A.");
//    }
//}

public class FunctionalInterface {
    public static void main(String[] args) {
//        Types
//        Normal -- interface has 2 or more methods
//        Functional / SAM (single abstract method) -- single abstract interface method interface
                    // we can achieve this by the Annotations -- FunctionalInterface (other wise it will allow multiple methods in SAM)
//        Marker -- which has no methods

            A obj = new A(){//anonymous Innerclass
                public void show(){
                    System.out.println("in show form InnerClass Anonymous.");
                }
            };
            obj.show();
    }
}
