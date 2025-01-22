package module1;

//Base Class
abstract class Animal {
	// Abstract method to be implemented by subclasses
	public abstract String speak();
}

//Main Class to Demonstrate Polymorphism
public class AnimalTest {
	public static void main(String[] args) {
		// Create an array of animals
		Animal[] animals = { new Dog(), new Cat(), new Bird(), new Fish() };

		// Demonstrate polymorphism
		for (Animal animal : animals) {
			System.out.println(animal.getClass().getSimpleName() + ": " + animal.speak());
		}
	}
}

//Subclass for Bird
class Bird extends Animal {
	@Override
	public String speak() {
		return "Tweet!";
	}
}

//Subclass for Cat
class Cat extends Animal {
	@Override
	public String speak() {
		return "Meow!";
	}
}

//Subclass for Dog
class Dog extends Animal {
	@Override
	public String speak() {
		return "Woof!";
	}
}

//Subclass for Fish
class Fish extends Animal {
	@Override
	public String speak() {
		return "Blub!";
	}
}
