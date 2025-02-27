package minor1;

public class Employee extends Person {

	String empId;
	String jobTitle;

	public Employee(String firstName, String lastName, String empId, String jobTitle) {
		super(firstName, lastName);
		this.empId = empId;
		this.jobTitle = jobTitle;
	}

	public String getEmployeeId() {
		return empId;
	}

	@Override
	public String getLastName() {
		return super.getLastName() + jobTitle;
	}

}
