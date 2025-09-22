package JavaBegginerLevel.AdvConcepts.OOPS.UpCastingDownCasting;

class A{
    public void show(){
        System.out.println("in A show show()");
    }
}

class B extends A{
    public void show1(){
        System.out.println("in B show show1()");
    }
}

public class DownCasting {
    public static void main(String[] args) {
//        TypeCasting -- converting double() to int() //loss of data
//        double num = 4.5;
//        int a = (int)num;
//        System.out.println(a);

//        Similarly we are typecasting child class with parent -- (upCasting /  downCasting)
//        A obj = new A();
        A obj = (A) new B(); // upcasting B -> A
        obj.show();
//        obj.show1();// bcz of A reference (not valid)

        A obj1 = new B();

        B obj2 = (B) obj1; // DownCasting A -> B
        obj2.show1();

    }
}
