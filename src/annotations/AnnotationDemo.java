package annotations;

import collections.Student;

@Important(10)
public class AnnotationDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student student = new Student("Abhishek", 10);
	}

}
