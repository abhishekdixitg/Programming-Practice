package minor1;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();

		try {
			// Call the method that throws IllegalAccessException
			demo.throwIllegalAccessException();
		} catch (IllegalAccessException e) {
			// Handle the exception and print the message
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	public void throwIllegalAccessException() throws IllegalAccessException {
		throw new IllegalAccessException("Illegal access detected in the method!");
	}
}
