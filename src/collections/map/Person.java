package collections.map;

import java.util.Objects;

public class Person implements Comparable<Person> {
	double marks;
	String name;

	Person(String name, double id) {
		this.name = name;
		this.marks = id;
	}

	@Override
	public int compareTo(Person o) {
		return Double.compare(o.getMarks(), this.getMarks());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}

	public double getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name);
	}

	public void setMarks(double id) {
		this.marks = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [marks=" + marks + ", name=" + name + "]";
	}

}
