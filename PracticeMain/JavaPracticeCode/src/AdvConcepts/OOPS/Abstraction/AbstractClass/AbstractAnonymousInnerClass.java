package AdvConcepts.OOPS.Abstraction.AbstractClass;

abstract class A{
    public abstract void show();
    public abstract void config();
}

//creating child class to implement abstract class show() method.
//class B extends A{
//    public void show(){
//        System.out.println("in B show...");
//    }
//}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
//        creating abstract object for  Anonymous Inner Class + object of InnerClass
    A obj = new A(){
        public void show(){
            System.out.println("implementing abstract show() of abstract class method in Anonymous InnerClass");
        }

        public void config(){
            System.out.println("implementing abstract config() of abstract class method in Anonymous InnerClass");
        }
    };

    obj.show();
    obj.config();
    }
}
