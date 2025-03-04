package collections.map;

import java.util.LinkedHashMap;

public class LRUCacheDemo<K, V> extends LinkedHashMap<K, V> {

	public static void main(String[] args) {
		LRUCacheDemo<String, Integer> demo = new LRUCacheDemo<>(3);
		demo.put("Abhishek", 10);
		demo.put("Aadi", 20);
		demo.put("keshav", 30);
		System.out.println(demo);
		demo.put("vasu", 40);
		System.out.println(demo);
	}

	int capacity;

	LRUCacheDemo(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > capacity;
	}

}
