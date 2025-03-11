package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 *
 *  FIFO
 *
 *  enqueue -- add/offer
 *
 *  dequeue - remove/poll
 *
 *  peek/element
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		// linked list as queue
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10); // enqueue
		list.addLast(20);
		list.addLast(30);

		System.out.println(list);

		list.removeFirst(); // dequeue

		System.out.println(list);

		list.getFirst(); // peek

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println(queue);

		queue.remove();

		System.out.println(queue);

		queue.peek();

		Queue<Integer> queue1 = new LinkedList<>();
		System.out.println(queue1.size());
		// System.out.println(queue1.remove()); // throw exception if empty

		System.out.println(queue1.poll()); // return null if empty

		// System.out.println(queue1.element());// throw exception if empty

		System.out.println(queue1.peek());
	}
}
