package collections.map;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {

		Person Person1 = new Person("Abhishek", 95.5);
		Person Person2 = new Person("Aadi", 98.5);
		Person Person3 = new Person("Rijul", 99.5);
		Person Person4 = new Person("Himanshu", 95.5);

		List<Person> listPerson = new ArrayList<>();
		listPerson.add(Person1);
		listPerson.add(Person2);
		listPerson.add(Person3);
		listPerson.add(Person4);
		listPerson.sort(null);
		System.out.println(listPerson);
	}

}
