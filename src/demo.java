public class demo {

	public static void main(String[] args) {
		testMath t = (i, j) -> i + j;
		int result = t.add(5, 8);
		System.out.println(result);
		t.divide(1, 0);
	}
}

@FunctionalInterface
interface testMath {
	static int multply(int a, int b) {
		return a * b;
	}

	int add(int i, int j);

	default void divide(int a, int b) {
		int i = 0;
		try {
			i = a / b;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero not allowed");
			
			System.exit(0);
			return;
		} finally {
			System.out.println("inside finally");
		}
		System.out.println("after exception");
	}
}
