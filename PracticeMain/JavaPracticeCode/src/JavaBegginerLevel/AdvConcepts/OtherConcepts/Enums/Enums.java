package JavaBegginerLevel.AdvConcepts.OtherConcepts.Enums;

//enumeration (enum) - named constants

//similar to Class -> 'Status' is Class Name
// you can not extend an enum just like class remaing everything is same like Classes --> (constructor, methods, var)
enum Status{
    //objects
    Running, Failed, Pending, Success;
}
public class Enums {
    public static void main(String[] args) {
        // dataType varName = value;
        // int i =10;

//        Status sts = Status.Running;
//        System.out.println(sts);
//        System.out.println(sts.ordinal());

        Status[] sts = Status.values();

        System.out.println(sts[0]);

        System.out.println("---------ForLoop-----------");
        for (int i = 0; i < sts.length; i++) {
            System.out.println(sts[i] + " -- Ordinal(Index) order: "+sts[i].ordinal());
        }

        System.out.println("-----Enhanced Loop---------");
        for (Status s : sts){
            System.out.println(s+" Order: "+s.ordinal());
        }
    }
}
