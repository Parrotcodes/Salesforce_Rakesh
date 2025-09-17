package UnitTesting.JavaTest.TestOOPs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestOOPS {

    //Encapsulation
    @Test
    void testMinBalance(){
        BankAccount bank = new BankAccount(500);
        assertEquals(500,bank.getBalance());

        bank.depoist(500);;
        assertEquals(1000,bank.getBalance());

        bank.withdraw(400);
        assertEquals(600,bank.getBalance());

        bank.withdraw(1200);
        assertEquals(String.valueOf(-600),bank.getBalance(),"No sufficient balance");
    }

//    Inheritance
    @Test
    void testAnimal(){
        Animal animal = new Animal();
        String sound = animal.sound();
        assertEquals("Some sound",sound);

        Dog dog = new Dog();
        String bark = dog.sound();
        assertEquals("Bark",bark);


        Animal newDog = new Dog();
        String psound = newDog.sound();
        assertEquals("Bark",psound);
    }

//    Polymorphism
    @Test
    void testCalculator(){
        Calculator cal = new Calculator();
        int sum = cal.add(2,4);
        assertEquals(6,sum);

        double total = cal.add(2.0,5.5);
//        assertEquals(7.5,total,0.01);

        double subtract = cal.sub(2.5,1.5);
//        assertEquals(String.valueOf(1.0),subtract,0.01);
    }

    @Test
    void testMethodOverloading() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5));
        assertEquals(7.5, calc.add(3.0, 4.5));
    }

    @Test
    void testMethodOverriding() {
        Animal animal = new Animal();
        Dog dog = new Dog();

        assertEquals("Some sound", animal.sound());
        assertEquals("Bark", dog.sound());
    }


//    Abstraction
    @Test
    void testArea(){
        Shape circle = new Circle(5) ;

        assertEquals(78.54, circle.area(), 0.01);

    }

//    Interface
    @Test
    void testInterfaceVehicle(){
        VehicleInterface vehicle = new Car();
        String msg = vehicle.move();

        assertEquals("Car drives on road",msg);
    }

}
