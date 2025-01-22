package module1;

//Child Class - Inheriting ParentClass
class ChildClass extends ParentClass {
	// Uncommenting the below code will cause an error because final methods cannot
	// be overridden
	// @Override
	// public void displayFinalMethod() {
	// System.out.println("Cannot override a final method.");
	// }

	@Override
	public void displayNonFinalMethod() {
		System.out.println("This is an overridden method in the ChildClass.");
	}
}

//Final Class - Cannot be inherited
final class FinalClass {
	public void displayMessage() {
		System.out.println("This is a method in a final class.");
	}
}

//Main Class
public class FinalKeywordExample {
	public static void main(String[] args) {
		// Demonstrating final variable
		ParentClass parent = new ParentClass();
		System.out.println("Final variable value: " + parent.finalVariable);
		// parent.finalVariable = 200; // Error: Cannot modify a final variable

		// Demonstrating final method
		parent.displayFinalMethod();

		// Demonstrating method overriding
		ChildClass child = new ChildClass();
		child.displayNonFinalMethod();

		// Demonstrating final class
		FinalClass finalClass = new FinalClass();
		finalClass.displayMessage();
		// Uncommenting the below line will cause an error because FinalClass cannot be
		// inherited
		// class ExtendedFinalClass extends FinalClass {}
	}
}

//Parent Class
class ParentClass {
	// Final variable - Value cannot be changed after initialization
	final int finalVariable = 100;

	// Final method - Cannot be overridden
	public final void displayFinalMethod() {
		System.out.println("This is a final method in the ParentClass.");
	}

	// Non-final method
	public void displayNonFinalMethod() {
		System.out.println("This is a non-final method in the ParentClass.");
	}
}
