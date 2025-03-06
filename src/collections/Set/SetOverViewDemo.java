package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *
 * No duplicate allowed
 *
 * based on hashmap principal
 *
 *
 */
public class SetOverViewDemo {
	public static void main(String[] args) {

		// hashset - unordered
		Set<Integer> set = new HashSet<>();
		set.add(10);

		set.add(20);
		set.add(10);
		set.add(30);
		set.add(40);
		System.out.println(set);

		// LinkedHashSet - ordered
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(20);
		set1.add(10);

		set1.add(30);
		set1.add(40);
		System.out.println(set1);

		// TreeSet - Sorted
		Set<Integer> set2 = new TreeSet<>();
		set2.add(20);
		set2.add(10);

		set2.add(30);
		set2.add(40);
		System.out.println(set2);

	}
}
