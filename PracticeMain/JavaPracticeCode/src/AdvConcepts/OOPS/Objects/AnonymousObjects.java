package AdvConcepts.OOPS.Objects;

class A{
    int age;
    String name;

    public A(){
        System.out.println("object created...");
    }

    public void show(){
        System.out.println("calling in A show()");
    }
}

public class AnonymousObjects {
    public static void main(String[] args) {
//    A a =  new A(); //creating obj and assigned to referenced to var -- we can reuse such type of object
        new A();// creating Anonymous object
        new A().show(); // one more object created
    }
}
