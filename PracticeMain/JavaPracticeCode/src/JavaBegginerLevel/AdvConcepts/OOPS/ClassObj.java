package JavaBegginerLevel.AdvConcepts.OOPS;
//        Objected Oriented Programming
//        Object - properties and Behaviours

import java.util.Scanner;

//        Class -- BluePrint (var + methods)
class Calc{
    int num1;
    int num2;

//    methods
    public int add(int x, int y){
        return x+y;
    }
}

class Computer{
    public void playMusic(){
        System.out.println("playing music.....");
    }
    public String getPen(){
        return "Here is your Pen.";
    }
    public void BuyMouse(int price){
        int res = price;
        System.out.println("The Cost of Mouse is "+price);
    }
}

public class ClassObj {
    public static void main(String[] args) {
//Object --- new keyword creating object
        Calc obj = new Calc();

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Two number to Add: ");
        int n1 = inp.nextInt();
        int n2 = inp.nextInt();

        int res = obj.add(n1,n2);
        System.out.println("The sum of "+n1 +" and "+n2+" is "+res);

//Computer Object
        Computer comp = new Computer();
        comp.BuyMouse(50);
    }
}
