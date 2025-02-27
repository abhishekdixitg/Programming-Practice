package minor1;

import java.lang.reflect.Field;

class MyClass {
	private String privateField = "Access private field";
}

public class NoSuchFieldExceptionDemo {
	public static void accessPrivateField(Object obj) throws NoSuchFieldException {
		Field field = String.class.getDeclaredField("privateField");
	}

	public static void main(String[] args) {
		try {
			MyClass myObject = new MyClass();

			accessPrivateField(myObject);
		} catch (NoSuchFieldException e) {
			System.err.println("No Such Field: " + e);
		}
	}
}
