package AdvConcepts.OOPS.Abstraction.Interfaces;

//we can create multiple interfaces and also we can extends the interfaces just like classes
// we can also implement 1 or more interfaces for a single class

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

//interface can only used for methods and variable can be declared as final (CONSTANT)
//interface methods must use/develop the methods which are implementing them in classes must use

interface Computer{
    void code();
}

interface AdvComputer{
    void GamingDev();
}

interface SuperComputer extends AdvComputer{
    void HackingOS();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile, run in Laptop");
    }
}

//implements multiple interfaces
class PC implements Computer,AdvComputer{
    public void code(){
        System.out.println("code,compile, run Faster in PC");
    }

    public void GamingDev(){
        System.out.println("PC is best to develop Games and Run code faster...");
    }
}

class Hacker implements SuperComputer{
    public void GamingDev(){
        System.out.println("We can Develop highly complex Games and executes faster... than AdvComp..");
    }

    public void HackingOS(){
        System.out.println("You can crack any system with this SuperAdvComputer.");
    }
}

public class InterfacesCon {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer pc = new PC();

        AdvComputer advpc = new PC();

        Hacker superComp = new Hacker();

        lap.code();
        pc.code();

        advpc.GamingDev();

        superComp.GamingDev();
        superComp.HackingOS();


    }
}
