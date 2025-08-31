package JavaBegginerLevel.AdvConcepts.OOPS.Abstraction.AbstractClass;

abstract class Car{
    public abstract void drive();
    public abstract void openTop();

    public void playMusic(){
        System.out.println("music is playing... in CAR");
    }
}

abstract class AudiQ7 extends Car{
    public abstract void fly();

    public void drive(){
        System.out.println("Car is driving.... Audi");
    }

    @Override
    public void playMusic(){
        System.out.println("playing music is overrides abstract Car");
    }
}

class Audi7GFly extends AudiQ7{
    public void fly(){
        System.out.println("New generation Flying car....");
    }

    public void openTop(){
        System.out.println("OpenTop features also available....");
    }
}



public class AbstractInfo {
    public static void main(String[] args) {
    Car newCar = new Audi7GFly();

    newCar.drive();
    newCar.playMusic();
//    newCar.fly();

        System.out.println("---------Advanced flying car features...-------------");
        AudiQ7 newCC = new Audi7GFly();
        newCC.drive();
        newCC.playMusic();
        newCC.fly();
        // from the extends of AudiQ7
        newCar.openTop();

    }
}
