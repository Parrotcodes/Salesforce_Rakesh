package AdvConcepts.OtherConcepts.InnerClass;

//class inside another class
// we can make inner class as static but not outer class
// when it is in static we don't need obj, we directly refer with main Class
//outer class -- only public,abstract and final are permitted

class Parent{
    public void show(){
        System.out.println("show() from parent class ....");
    }

    class ParentChild {
        public void show(){
            System.out.println("show() from ParentChild class");
        }

        public void config(){
            System.out.println("config from ParentChild class");
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();

        Parent.ParentChild newObj = obj.new ParentChild();
        newObj.show();
        newObj.config();

    }
}
