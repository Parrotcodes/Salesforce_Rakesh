package JavaBegginerLevel.AdvConcepts.keywords;

class Mobile{
    String brand;
    int price;
    static String name;
//static variable
    //static String name="SmartPhone";//declare here also allowed
    //static -> name is common for all objects
    //static variables can call with Class name and also with object (avoid)

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

//static method
//    static variables only can allow inside static method.
//    non-static variables can access with reference object of Class

    public static void show1(){
        System.out.println("This is from static method show1() -> "+name);
    }

    public static void showVar(Mobile obj){
        System.out.println("This is from static method showVar() -> "+obj.price+" : "+obj.brand+" : "+name);
    }

//static-block -- it will call only Once and it will call first rather than constructor
    static {
//        default value -- takes all the new_Objects if value not assigned
        name="Phone";
    System.out.println("in static block");
    }

//    --- default values --Constructor -- calls/Loads each newObject
    public Mobile(){
        brand ="";
        price = 500;
//        name="Phone";
        System.out.println("in constructor");
    }
}

public class staticFile {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
//        obj1.name="SamrtPhone";
        Mobile.name="SmartPhone";
        obj1.price=10000;

        Mobile obj2 = new Mobile();
        obj2.brand="SamSung";
//        obj2.name="SamrtPhone";
        Mobile.name="SmartPhone";
        obj2.price=1000;

//        static-block checking -- default values
        Mobile staticObj = new Mobile();

        obj1.show();
        obj2.show();
        Mobile.show1();
        Mobile.showVar(obj2);


//        Calss.forName -- is used to load the class (when there is no object is created with this we can load our class direct)
//        Class.forName("AdvConcepts.keywords.Mobile"); //(require to load class with creating any object !important)
    }
}
