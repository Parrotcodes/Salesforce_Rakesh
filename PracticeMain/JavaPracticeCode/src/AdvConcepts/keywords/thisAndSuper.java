package AdvConcepts.keywords;

//class Parent extends Object --> Every Class in Java extends an Object by default
class Parent{
    public Parent(){
        super();//default
        System.out.println("in parent...");
    }

    public Parent(int x){
        super();//default
        System.out.println("in parent int");
    }
}

class Child extends Parent{
    public Child(){
        super();//default
        System.out.println("in child....");
    }

    public Child(int x){
        this(); //execute the constructor of same class
        System.out.println("in child int");
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        Child obj = new Child(5);
    }
}
