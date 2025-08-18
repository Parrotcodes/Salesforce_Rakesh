package Week1.Day2.OOPS.Polymorpism;

//Method Overloading (Compile-time Polymorphism)
//Same method name, different parameter list (different type or number of arguments).

class BasicCalculator{
	int add(int a,int b) {
		return a+b;
	}
	
	double add(double a,double b) {
		return a+b;
	}
}

//Method Overriding (Runtime Polymorphism)
//Child class provides its own version of a method from the parent class with the same name, parameters, and return type.
class Animal{
	void eat() {
		System.out.println("eatingg..");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("dog is eatinggg....");
	}
}

public class Polymorpism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator sum = new BasicCalculator();
		System.out.println(sum.add(2, 4));
		System.out.println(sum.add(3.5,	4.5));
		
		
//		overriding
//		Animal obj = new Dog();
		Dog obj = new Dog();
		obj.eat();

	}

}
