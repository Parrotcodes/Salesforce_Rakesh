package JavaBegginerLevel.AdvConcepts.OOPS.OverLoadingRidiing;

//---------Method OverLoadding ------------------
// We can have different no.of parameter, (or) we can have same no.of parameter but diff return type

class Calc{

    public boolean add(){
        System.out.println("No return type");
        return false;
    }
    public int add(int x,int y){
        return x+y;
    }

    public double add(double x,int y){
        return x+y;
    }

    public int add(int x,int y,int z){
        return x+y+z;
    }
}

public class OverLoadding {
    public static void main(String[] args) {
    Calc c = new Calc();
        System.out.println("---------OutPut----------");

        System.out.println(c.add());
        System.out.println(c.add(2,3));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(5.5,4));
    }
}
