package assignments.module1;

//Parent Class
class AnimalExample {
	String name;

	// Constructor of Parent Class
	AnimalExample(String name) {
		this.name = name; // 'this' refers to the current object's field
	}

	void displayInfo() {
		System.out.println("Animal Name: " + name);
	}
}

//Child Class
class DogExample extends AnimalExample {
	String breed;

	// Constructor of Child Class
	DogExample(String name, String breed) {
		super(name); // 'super' calls the parent class constructor
		this.breed = breed; // 'this' refers to the current object's field
	}

	@Override
	void displayInfo() {
		super.displayInfo(); // 'super' calls the parent class method
		System.out.println("Dog Breed: " + this.breed); // 'this' refers to the current object's field
	}
}

//Main Class
public class ThisAndSuperExample {
	public static void main(String[] args) {
		DogExample dog = new DogExample("Buddy", "Golden Retriever");
		dog.displayInfo();
	}
}
