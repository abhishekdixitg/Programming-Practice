package exceptionHandling;

public class CustomException {
	public static void main(String[] args) {
		try {
			validateAge(15);
		} catch (CustomExceptionExample e) {
			System.out.println(e.getMessage());
		}
	}

	static void validateAge(int age) throws CustomExceptionExample {
		if (age < 18) {
			throw new CustomExceptionExample("Age must be 18 or older.");
		}
	}
}

class CustomExceptionExample extends Exception {
	public CustomExceptionExample(String message) {
		super(message);
	}
}
