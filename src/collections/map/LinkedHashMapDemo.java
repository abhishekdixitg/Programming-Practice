package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 10);
		map.put("Orange", 20);
		map.put("grapes", 30);

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " :value:: " + entry.getValue());
		}

		// the ordering mode - <tt>true</tt> for access-order, <tt>false</tt> for
		// insertion-order
		LinkedHashMap<String, Integer> linkMap = new LinkedHashMap<>(11, 0.3f, true);
		linkMap.put("Apple", 10);
		linkMap.put("Orange", 20);
		linkMap.put("grapes", 30);
		linkMap.get("Orange");

		for (Entry<String, Integer> entry : linkMap.entrySet()) {
			System.out.println(entry.getKey() + " :Link Map value:: " + entry.getValue());
		}

	}

}
