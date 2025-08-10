
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

}


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

        System.out.println("----1.Polymorphism-----");
        
    }
}
