package assignments.module1;

public class DefaultValues {

	public static void main(String[] args) {
		// Creating an instance of the class to access instance variables
		DefaultValues defaultValues = new DefaultValues();

		System.out.println("Default values of all primitive data types in Java:");
		System.out.println("byte: " + defaultValues.defaultByte);
		System.out.println("short: " + defaultValues.defaultShort);
		System.out.println("int: " + defaultValues.defaultInt);
		System.out.println("long: " + defaultValues.defaultLong);
		System.out.println("float: " + defaultValues.defaultFloat);
		System.out.println("double: " + defaultValues.defaultDouble);
		System.out.println("char: " + defaultValues.defaultChar); // Will print an empty space
		System.out.println("boolean: " + defaultValues.defaultBoolean);
	}

	// Declaring all primitive data types as instance variables
	byte defaultByte;
	short defaultShort;
	int defaultInt;
	long defaultLong;
	float defaultFloat;
	double defaultDouble;
	char defaultChar;

	boolean defaultBoolean;
}
