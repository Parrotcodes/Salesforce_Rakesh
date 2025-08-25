//diff Annotations -- methods, variables, class level etc.

class A{
    public void showTheDataFromThisClass(){
        System.out.println("in A Show view()");
    }
}

class B extends A{
    //Annotation
    @Override
    public void showTheDataFromThisClass(){
        //debugging if we miss class name mismatch
        System.out.println("in B Show view()");
    }

}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataFromThisClass();
    }
}
