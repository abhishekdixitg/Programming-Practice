package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "grapes");
		map.put(null, "abcd");
		map.put(3, "bacd");

		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.entrySet());
		for (Entry<Integer, String> i : map.entrySet()) {
			System.out.println(i.getKey() + " value:: " + i.getValue());
		}

	}
}
