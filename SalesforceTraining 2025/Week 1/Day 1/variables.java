// Variable in Java is a data container that stores the data values during Java program execution. 
// Java variables have mainly three types : Local, Instance and Static.

// Variable Declaration
// Variable Initialization

class variables{
    static int a=10;
    int age =18;
    

    public static void main(String[] args) {
        int count =10;
        System.out.println("Variables \n Number:" + count);
        System.out.println("Static variable 'a': "+ a);
        // System.out.println("Instance Varibale 'age': " + age);
        variables obj1 = new variables();
        System.out.println("Instance varibale using object: obj1 = "+obj1.age);

        // Data Types
    }
}