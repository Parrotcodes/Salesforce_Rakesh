class Parent{
    String name;

    void meet(){
        System.out.println("parent meeting child.......");
    }
}

class  Child extends Parent{
    int id;

    void meet(){
        System.out.println("Child meeting parent.........");
    }
}


public class Casting{
    public static void main(String[] args) {
        Parent p = new Child();

//        up casting - implicitly
        p.name = "Casting checking...";
        p.meet();

//        upcasting - explicitly
//        Child c = new Parent(); -- not possible we need to do it explicitly
        Child c = (Child) p;

        c.id = 10;
        c.name= "Child Casting accessing parent var";
        c.meet();
    }
}