package assignments.module1;

class Employee {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public void disaplyDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Age: " + age);
		System.out.println("Employee Salary: " + salary);
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setAge(int age) {
		if (age > 0) { // Validation to demonstrate controlled access
			this.age = age;
		} else {
			System.out.println("Age must be positive!");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		if (salary > 0) { // Validation to demonstrate controlled access
			this.salary = salary;
		} else {
			System.out.println("Salary must be positive!");
		}
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		Employee employee = new Employee("Abhishek", 20, 5000.00);
		employee.disaplyDetails();

		System.out.println("\nUpdating Employee Details...");

		// Update employee details using setters
		employee.setName("Abhishek Dixit");
		employee.setAge(28);
		employee.setSalary(55000.00);

		// Display updated employee details
		employee.disaplyDetails();

		System.out.println("\nTrying invalid updates...");
		employee.setAge(-5); // Invalid age
		employee.setSalary(-10000); // Invalid salary

	}

}
