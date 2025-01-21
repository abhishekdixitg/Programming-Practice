package M1;

class Calculate {

	int calculator(int a, int b) {
		System.out.println(a + b);
		return 0; // default and can be abstract
	}

	int calculator(int a, int b, int c) {

		return 0; // default and can be abstract
	}
}

class Multi extends Calculate {
	@Override
	int calculator(int a, int b) {
		return a * b;
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		Multi mult = new Multi();
		Calculate add = new Sum(); // run time polymorphism or dynamic method dispatch

		// Calling overridden methods
		System.out.println("Multiplication Result: " + mult.calculator(3, 2));
		System.out.println("Addition Result: " + add.calculator(4, 5, 6));

	}
}

class Sum extends Calculate {
	@Override
	int calculator(int a, int b, int c) {
		return a + b + c;
	}
}
