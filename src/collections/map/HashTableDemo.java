package collections.map;

import java.util.Hashtable;

/*
 *  Legacy class available from JDK 1.0
 *  Hashtable is Synchronized
 *  no null key and value allowed
 *  slower than HashMap
 *  only linkedlist in case of collison
 */
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> demo = new Hashtable<>();
		demo.put(1, "Apple");
		demo.put(2, "banana");
		demo.put(3, "orange");

		// demo.put(null, "orange"); // throws exception
		// demo.put(4, null); // throws exception
		System.out.println(demo);

	}
}
