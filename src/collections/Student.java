package collections;

public class Student {
	private String name;
	private double marks;

	public Student(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}
}
