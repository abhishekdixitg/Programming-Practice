package assignments.module1;

//Main class
public class ConstructorDemo {
	public static void main(String[] args) {
		// Using default constructor
		Person person1 = new Person();
		person1.displayInfo();

		// Using parameterized constructor
		Person person2 = new Person("Alice", 25);
		person2.displayInfo();

		// Using copy constructor
		Person person3 = new Person(person2);
		person3.displayInfo();
	}
}

//Class to represent a Person
class Person {
	String name;
	int age;

	// Default Constructor
	public Person() {
		this.name = "Unknown";
		this.age = 0;
		System.out.println("Default constructor called!");
	}

	// Copy Constructor
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
		System.out.println("Copy constructor called!");
	}

	// Parameterized Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Parameterized constructor called!");
	}

	// Method to display Person details
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
