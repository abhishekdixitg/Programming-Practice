package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeDemo {
	public static void main(String[] args) {
		Student stud1 = new Student("Aadi", 22);
		Student stud2 = new Student("Himanshu", 29);
		Student stud3 = new Student("Vasu", 28);
		Student stud4 = new Student("Aadi", 22);

		// System.out.println(stud1);
		Map<Student, String> studMap = new HashMap<>();
		studMap.put(stud1, "Java");
		studMap.put(stud2, "Java");
		studMap.put(stud3, "Java");
		studMap.put(stud4, "Java Programming");

		System.out.println(studMap);

	}
}
