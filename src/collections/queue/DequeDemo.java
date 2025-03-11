package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
 *
 * Double ended queue
 *
 * allow insertion and deletion at both end
 *
 * support both stack and queue operations
 */
public class DequeDemo {
	public static void main(String[] args) {
		// faster iteration, low memory, no null allowed, circular array (head and tail)
		// no need to shift element , only change head and tail
		Deque<Integer> dq1 = new ArrayDeque<>();

		dq1.addFirst(10);
		dq1.addLast(20);

		dq1.offerFirst(30);
		dq1.offerLast(40);

		System.out.println(dq1);

		dq1.removeFirst();

		dq1.pollLast();

		System.out.println(dq1);

		Deque<Integer> dq2 = new LinkedList<>(); // if we have to insert and delete in middle
	}
}
