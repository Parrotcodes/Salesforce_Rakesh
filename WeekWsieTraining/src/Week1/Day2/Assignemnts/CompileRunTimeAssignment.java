package Week1.Day2.Assignemnts;

//Write a program to demonstrate runtime polymorphism and Compile time polymorphism.

//parent
class Shape{
    public void area(int s){
        System.out.println("Square Area:"+(s*s));
    }

    public void area(int l,int b){
        System.out.println("Rectangle Area:"+(l*b));
    }

    public void draw(){
        System.out.println("Drawing....");
    }
}

//child
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing a circle....");
    }
}

public class CompileRunTimeAssignment {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area(3);;
        s1.area(4,5);

        Circle c = new Circle();
        c.draw();
    }
}
