package Week1.Day1;// Variable in Java is a data container that stores the data values during Java program execution.
// Java variables have mainly three types : Local, Instance and Static.

// Variable Declaration
// Variable Initialization

class A{

}

class D{

}

class Basics{
    static int a=10;
    int age =18;
    

    public static void main(String[] args) {

        System.out.println("--------Variables-------");
        int count =10;
        System.out.println("Variables \n Number:" + count);
        System.out.println("Static variable 'a': "+ a);
        // System.out.println("Instance Varibale 'age': " + age);
        Basics obj1 = new Basics();
        System.out.println("Instance varibale using object: obj1 = "+obj1.age);

        System.out.println("--------Data Types-------");
        // Data Types
            // Primitive Data Types - int,float,double,long,short,byte,char,boolean
            int i = 10;
            float f = 8.9f;
            double d = 435.464;
            char c = 'A';
            short s = 78;
            boolean b = true;

            System.out.println("Integer - Number : "+ i);
            System.out.println("float : "+ f);
            System.out.println("double : "+ d);
            System.out.println("char : "+ c);
            System.out.println("short : "+ s);
            System.out.println("Boolean : "+ b);

        // Wrapper Class
        System.out.println("---------Wrapper Class (primitive to wrapper class)----");
        String str = "Welcome";
        System.out.println(str);

        // Integer i1 = Integer.valueOf(i);
        Integer i1 = i;
        Float f1 = f;
        System.out.println(i1);
        System.out.println(f1);

        System.out.println("-----Convert Wrapper Objects to Primitive Types---");
        Integer num1 = 23;
        Float fnum = 4.88f;


        int var1 = num1;
        System.out.println(var1);
        
        float fl1 = fnum;
        System.out.println(fl1);

        // Instance of -- present/related to that method or type of class
        System.out.println("---- Instance of ----");
        A obj = new A();
        System.out.println(obj instanceof A);

        if(num1 instanceof Integer ){
            System.out.println("Yes, num1 is instance of Integer wrapper class");
        }
// Java compiler automatically converts the primitive types into corresponding objects and vice versa. This process is known as autoboxing and unboxing.       

        System.out.println("---------Operators----");
        // Operators
        operators();

        // Conditional Statements
        Conditionals();

        // Iterators or Loops
        Loops();


     

    }

      public static void  operators(){
            int a = 4;
            int b = 6;
            // int result = a + b;
            // System.out.println("Sum of two numbers: "+ result);


            // Arthematic operators
            // addition operator
            System.out.println("a + b = " + (a + b));

            // subtraction operator
            System.out.println("a - b = " + (a - b));

            // multiplication operator
            System.out.println("a * b = " + (a * b));

            // division operator
            System.out.println("a / b = " + (a / b));

            // modulo operator
            System.out.println("a % b = " + (a % b));

            // Assignement, Relational, Logical (&&,||, !), Unary(++,--,+,-,!), Bitwise(~,<<,>>,&,^), Instanceof, Ternary(?:),
        }

        public static void Conditionals() {
            
        }

        public static void Loops(){
            int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
        }
        }
