package collections.map;

import java.util.concurrent.ConcurrentHashMap;

/*
 *
 * Thread safe class
 *
 * Java 7:
 *   Segment based lock
 *   16 segments - smaller hashmaps
 *   independent locking in each segments.
 *   Only the segments being written to or read form is locked
 *   read: do not require locking unless there is a write operation happening in the same segment
 *   write: lock
 *
 *
 * Java 8:
 *    No segmentation
 *    Compare and swap approach
 *    no locking except resizing or collision
 *       ex: Thread t1 (last saw): a = 22
 *           t1 to work on replacing a = 35, if last saw val is still 22 then replace otherwise retry
 *
 *    resizing of the bucket happens by adding 1 bucket at a time (not like hashmap resizing that double the size)
 *
 */
public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> demo = new ConcurrentHashMap<>();
		demo.put("Apple", 10);
		demo.put("Orange", 20);
		demo.put("banana", 30);
		System.out.println(demo);
	}

}
