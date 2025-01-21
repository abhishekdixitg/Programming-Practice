package M1;

class Addition extends Calculator {
	@Override
	int calculate(int a, int b) {
		return a + b;
	}
}

class Calculator {
	int calculate(int a, int b) {
		System.out.println(a + b);
		return 0; // default and can be abstract
	}
}

public class InheritenceExample {
	public static void main(String[] args) {
		Multiply mult = new Multiply();
		Addition add = new Addition();

		// Calling overridden methods
		System.out.println("Multiplication Result: " + mult.calculate(3, 2));
		System.out.println("Addition Result: " + add.calculate(4, 5));

	}
}

class Multiply extends Calculator {
	@Override
	int calculate(int a, int b) {
		return a * b;
	}
}
