package exceptionHandling;

import java.util.logging.Level;
import java.util.logging.Logger;

class exceptionHandling {
	public static final Logger logger = Logger.getLogger(exceptionHandling.class.getName());

	public void divide(int a, int b) {
		try {
			if (a > 1) {
				throw new CustomExceptionExample("value greater than 1");
			}
			System.out.println(a / b);
		} catch (ArithmeticException | CustomExceptionExample e) {
			logger.log(Level.SEVERE, "Divide by zero not allowed");
			// System.out.println("Error: Divide by zero no allowed");
		} finally {
			System.out.println("After divide");
		}
		System.out.println("At the end");
	}
}

public class TestExceptiion {
	public static void main(String[] args) {
		exceptionHandling test = new exceptionHandling();
		test.divide(4, 1);
	}

}
