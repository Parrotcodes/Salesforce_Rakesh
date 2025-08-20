package Week1.Day2.OOPS.Inheritance;

class ParentAnimal{
	public String name;
	
	void eat() {
		System.out.println("animal is eating...");
	}
}

class DogChild extends ParentAnimal{
	void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("Child animal is sleeping... after eating");

	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------OOPS Inheritance-----");
		DogChild animal1 = new DogChild();
		animal1.eat(); //from parent
		animal1.sleeping(); //from child
	}

}
