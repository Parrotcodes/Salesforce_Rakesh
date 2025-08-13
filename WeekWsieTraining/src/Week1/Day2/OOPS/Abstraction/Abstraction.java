package Week1.Day2.OOPS.Abstraction;

class Car{
	public void drive() {
		System.out.println("driving car...");
	}
	
	public void playmusic() {
		System.out.println("playing music in car...");
	}
}

class Audi extends Car{
	public void drive() {
		System.out.println("driving..");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();
		bmw.drive();
		bmw.playmusic();
		

	}

}
