package UnitTesting.JavaTest.TestOOPs;

//Inheritance
class Animal {
    String sound() {
        return "Some sound";
    }
}

class Dog extends Animal {
    @Override
    String sound() {
        return "Bark";
    }
}

