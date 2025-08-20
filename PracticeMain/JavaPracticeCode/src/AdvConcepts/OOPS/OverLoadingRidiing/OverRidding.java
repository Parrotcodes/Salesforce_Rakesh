package AdvConcepts.OOPS.OverLoadingRidiing;

//Override -- both class has same method (if child doesn't have parent method calls, but if both have obj of Child method will be call)
class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    //overrides A
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

class Calcy{
    public int add(int x,int y){
        return x+y;
    }
}

class AdvCalcy extends Calcy{
    public int add(int x,int y){
        return x+y+1;
    }
}
public class OverRidding {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        AdvCalcy adv = new AdvCalcy();
        System.out.println("Called method from AdvCalcy(over rides Parent Class): "+ adv.add(3,3));
    }
}
