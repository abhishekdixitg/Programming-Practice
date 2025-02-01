package exceptionHandling;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			int a = 20;
			int b = 0;

			int result = a / b;

			System.out.println(result);
		} catch (Exception e) {
			System.out.println("divide by zero not allowed");
		}

	}
}
