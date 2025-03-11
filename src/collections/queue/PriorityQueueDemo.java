package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 *
 * Order elements based on their natural order
 *
 * custom comparator for customized ordering
 *
 * does not allow null elements
 *
 * PriorityQueue is based on min-heap by default (natural ordering)
 *
 * O(log n) - delete/insert , remove top o(1)
 */
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		// PriorityQueue<Integer> pq = new PriorityQueue<>(); // natural order
		pq.add(30);
		pq.add(10);
		pq.add(40);
		pq.add(20);
		System.out.println(pq); // not sorted

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}
}
