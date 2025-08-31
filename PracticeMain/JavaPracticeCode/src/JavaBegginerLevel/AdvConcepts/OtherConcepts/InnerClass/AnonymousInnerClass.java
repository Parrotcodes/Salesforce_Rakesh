package JavaBegginerLevel.AdvConcepts.OtherConcepts.InnerClass;

class MainClass{
    public void show(){
        System.out.println("in MainClass show...");
    }
}

//to override we need another class
// but to override one method, we are created new class (which is not required -> so we use Anonymous Classes)

//class ChildClass extends MainClass{
//    public void show(){
//        System.out.println("show() from the Child Class...");
//    }
//}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.show();

//Anonymous Class implementation to override the parent class method (No need of newClass and Object)
        MainClass obj2 = new MainClass(){
            public void show(){
                System.out.println("new method override from anonymous class from innerClass ");
            }
        };
        obj2.show();
    }
}
