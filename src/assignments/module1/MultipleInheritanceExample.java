package assignments.module1;

//Class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("Duck is flying.");
	}

	@Override
	public void swim() {
		System.out.println("Duck is swimming.");
	}
}

//First interface
interface Flyable {
	void fly();
}

//Main class to demonstrate multiple inheritance
public class MultipleInheritanceExample {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.fly();
		duck.swim();
	}
}

//Second interface
interface Swimmable {
	void swim();
}
