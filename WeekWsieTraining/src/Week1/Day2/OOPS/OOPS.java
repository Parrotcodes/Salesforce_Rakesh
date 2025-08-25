package Week1.Day2.OOPS;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing....");
    }

    public void PenInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

// class,obj,constructor
// polymorphism
class Employee{
    String name;
    int age;
    String EmpId;

    public void printEmpInfo(){
        System.out.println("Emp Name:"+this.name);
        System.out.println("Emp Age:"+this.age);
        System.out.println("Emp Id:"+this.EmpId);
    }

    // non-parameter
    Employee(){
        System.out.println("Constructor called.. Non-parameter");
    }

    // parameter
    Employee(String name,int age,String EmpId){
        this.EmpId = EmpId;
        this.name = name;
        this.age = age;
    }

    // copy constr
    Employee(Employee emp3){
        this.EmpId = emp3.EmpId;
        this.name = emp3.name;
        this.age = emp3.age;
    }
//----------------------------------------Class,objects,constructor (types-non,par,copy)-----------------

//Polymorphism
    // overloadding -- Compile time (compile before run and checks the code)
    public void printEmpInfo(String name){
        System.out.println("Emp Name:"+name);
    }

     public void printEmpInfo(int age){
        System.out.println("Emp Age:"+age);
    }

    //  public void printEmpInfo(String name){
    //     System.out.println("Emp Name:"+name);
    // }

    public void printEmpInfo(String EmpId, String name){
        System.out.println("Id: "+EmpId);
        System.out.println("Name: "+name);
    }

    public void printEmpInfo(String EmpId,String name, int age){
        System.out.println("ID: "+EmpId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
//-------------------------------Polymorphism - (Overloadding)----------------------
// Inheritance 
// React -- resualbitly components (button/card)
class Shape{
    // parent
    String color;

    public void area(){
        System.out.println("display area...");
    }
}

class Triangle extends Shape{
    // child -- single level
    String type;

    public void area(int b,int h){
        System.out.println("Area: "+1/2*b*h);
    }

}

// hierarchial 
class Circle extends  Shape{
    public void area(int r){
        System.out.println("Area: "+ (3.14)*r*r);
    }
}

class EqualTriangle extends  Triangle{
    //sub-child -- multi level
    public void area(int b,int h){
            System.out.println("Area: "+1/2*b*h);
        }
}

// Encapsulation
abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eating..");
    }

    Animal(){
        System.out.println("New animal created..");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a new Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs.");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("created a new chicken");
    }
    public void walk(){
        System.out.println("walks on 2 legs.");
    }
}


// Interfaces
interface Bird{
    int eyes = 2;
    void fly(); //by defaults public,abstract
}

interface Herbivore{

}

class Eagle implements Bird{
    public void fly(){
        System.out.println("Flying eagle...");
    }
}

// multilevel inheritance
// class Deer implements Bird,Herbivore{
//     public void walk(){
//         System.out.println("multiple inheritance");
//     }
// }




// Main
public class OOPS {
    public static void main(String[] args) {
        System.out.println("------Class,Objects & constructors, (destrucor absent -- garbage collector)-----");
        
        // Objects
        Pen pen1 = new Pen();
        
        pen1.color = "Blue";
        pen1.type = "Gel Pen";
        pen1.write();
        pen1.PenInfo();
        
        System.out.println();
        
        Employee emp1 = new Employee();
        //Employee()-> constructor -- same name as class name, no return, void, call once by creating obj
        emp1.EmpId = "ITT/3435";
        emp1.name = "Rakesh";
        emp1.age = 18;
        
        emp1.printEmpInfo();
        System.out.println();
        
        
        Employee emp2 = new Employee("Harry",22,"Emp/5654");
        emp2.printEmpInfo();
        System.out.println();

        // copy constructor emp3 = emp2
        Employee emp3 = new Employee(emp2);
        emp3.printEmpInfo();

        // OOPS in Java
        System.out.println("------------OOPS--------");
        System.out.println("OOPS concepts in Java \n 1.Abstraction \n 2.Inheritence \n 3.Encapsulation \n 4.Polymorphism");
        System.out.println();

        System.out.println("----1.Polymorphism (overloading/compiletime,overriding/Runtime) -----");
        // overloadding -- same function names repeated

        Employee emp4 = new Employee();
        emp4.EmpId = "EMP/76687";
        emp4.name = "Jhon";
        emp4.age = 56;

        // calling
        emp4.printEmpInfo();
        System.out.println();

        emp4.printEmpInfo(emp4.EmpId);
        System.out.println();

        emp4.printEmpInfo(emp4.EmpId,emp4.name);
        System.out.println();

        emp4.printEmpInfo(emp4.name);
        System.out.println();

         emp4.printEmpInfo(emp4.EmpId,emp4.name,emp4.age);
        System.out.println();



        System.out.println("----2.Inheritance (parent->child properties relation) -----");
        System.out.println("----a.single level inheritance \n b.multi-level \n c.Hierarchial \n d.Hybrid inheritance -----");

        System.out.println();
        System.out.println("--------3.Encapsulation (properties+method) & DataHiding concept used--------");

        System.out.println();
        System.out.println("-------4.Abstraction (showing important only, hides functionaity unnecssary info)--------");

        Horse horse = new Horse();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.walk();

        // Animal animal = new Animal(); //abstract(cannot instantiate) -- runtime error
        // animal.walk();

        horse.eat();//inherits the Animal class methods

        // final -- similar to const


        System.out.println("2.Interfaces (abstractsion) ");
        System.out.println("-- similar to class but no constructors\n -- use implements keyword \n -- all fields are public,static,final by default. \n -- methods public & abstract by default. \n --");

        Eagle newEagle = new Eagle();
        newEagle.fly();

        // Deer newdeer = new Deer();
        // newdeer.walk();

        System.out.println("-----static keyword------");
        // static keyword -- once we implement it comes under this value only (school - all students belongs to same school)
        Student.school = "IIT Hyd";
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "haryy";
        student2.name = "Jhone";
        
        System.out.println("Info: "+student1.name+ "-"+ student1.school);
        System.out.println("Info: "+student2.name+ "-"+ student2.school);
        


    }
}

class Student{
    String name;
   static String school;
}