package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o2.getMarks() - o1.getMarks() < 0) {
			return -1;
		}
		if (o2.getMarks() - o1.getMarks() > 0) {
			return 1;
		}
		return o2.getName().compareTo(o1.getName());
	}

}

class IntComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}

}

public class TestArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(1000);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);

		list.add(2, 40);
		list.set(3, 60);
		System.out.println(list.get(1));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int val : list) {
			System.out.println(val);
		}

		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<int[]> list2 = Arrays.asList(arr);
		// list1.add(10);
		list1.set(1, 29);
		List<Integer> list4 = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			list4.add(list1.get(i));
		}
		System.out.println(list.getClass());
		System.out.println(list1.getClass());
		System.out.println(list2.getClass());

		Collections.sort(list);

		List<Integer> list5 = new ArrayList<>();
		list5.add(1);
		list5.add(3);
		list5.add(2);

		list5.sort(null);
		System.out.println(list5);

		IntComparator intComp = new IntComparator();
		list5.sort(intComp);
		System.out.println(list5);

		List<String> list6 = new ArrayList<>();
		list6.add("Abhishek");
		list6.add("Rijul");
		list6.add("Rahul");

		list6.sort(new StringComparator());
		System.out.println(list6);

		Student student1 = new Student("Abhishek", 95.5);
		Student student2 = new Student("Aadi", 98.5);
		Student student3 = new Student("Rijul", 99.5);
		Student student4 = new Student("Himanshu", 95.5);

		List<Student> listStudent = new ArrayList<>();
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);

		List<Student> listStudent2 = new ArrayList<>();
		listStudent2.addAll(listStudent);

		for (Student stud : listStudent2) {
			System.out.println(stud.getName() + " : " + stud.getMarks());
		}

		for (int i = 0; i < 4; i++) {

			listStudent.add(new Student("Abhishek", 10));
		}

		Comparator custComp = Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName)
				.reversed();
		listStudent.sort(custComp);
		for (Student stud : listStudent) {
			System.out.println(stud.getName() + " : " + stud.getMarks());
		}

	}
}
