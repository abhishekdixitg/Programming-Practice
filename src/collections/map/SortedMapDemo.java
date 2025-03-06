package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

/*
 *
 * SortedMap is an interface that extends Map. Sorted is done on the basis of keys.
 * Default is natural order and we can also pass comparator.
 * null key not allowed
 *
 * TreeMap implements sortedmap
 * TreeMap uses Red Black (self balancing) tree.
 *
 */
public class SortedMapDemo {
	public static void main(String[] args) {

		SortedMap<Integer, String> map1 = new TreeMap<>(); // natural order

		// SortedMap<Integer, String> map1 = new TreeMap<>((a, b) -> b - a); // with
		// comparator, reverse order

		map1.put(10, "Rahul");

		map1.put(20, "Shashank");
		map1.put(30, "xavier");
		map1.put(40, "Mohit");
		map1.put(50, "yaman");
		System.out.println(map1);

		SortedMap<String, Integer> map2 = new TreeMap<>();
		// SortedMap<String, Integer> map2 = new TreeMap<>((a, b) -> b.compareTo(a)); //
		// with comparator, reverse order

		map2.put("Rahul", 10);

		map2.put("Shashank", 20);
		map2.put("xavier", 30);
		map2.put("Mohit", 40);
		map2.put("yaman", 50);

		System.out.println(map2);

		System.out.println(map2.firstKey());
		System.out.println(map2.lastKey());
		System.out.println(map2.headMap("Shashank")); // exclude
		System.out.println(map2.tailMap("Shashank"));

	}
}
