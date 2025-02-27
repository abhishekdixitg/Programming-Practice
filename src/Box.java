public class Box {
	// Static variable to count the number of objects created
	private static int objectCount = 0;

	// Method to count the number of objects created
	public static int getObjectCount() {
		return objectCount;
	}

	// Main method for testing
	public static void main(String[] args) {
		// Creating objects of Box class
		Box box1 = new Box();
		Box box2 = new Box(10, 5, 15);

		// Display object count
		System.out.println("Number of objects created: " + Box.getObjectCount());

		// Display dimensions of box2
		System.out.println("Box 2 Dimensions: " + "Length = " + box2.length + ", Width = " + box2.width + ", Height = "
				+ box2.height);
	}

	// Member variables
	private double length;

	private double width;

	private double height;

	// Default constructor
	public Box() {
		this.length = 0;
		this.width = 0;
		this.height = 0;
		objectCount++; // Increment object count
	}

	// Parameterized constructor
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		objectCount++; // Increment object count
	}

}
