package UnitTesting.JavaTest.TestOOPs;


interface VehicleInterface {
    String move();
}

class Car implements VehicleInterface {
    @Override
    public String move() {
        return "Car drives on road";
    }
}
