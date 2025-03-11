package collections.queue;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Thread safe
 *
 * wait for queue to become non empty or wait for space
 *
 * better option for multithreaded envt. specially for producer consumer problem
 *
 * Methods
 *
 * put- block if queue is full until space is available
 *
 * take - block if queue is empty until an element become available
 *
 * offer - wait for space to become available, upto the specific timeout
 */
public class BlockingQueueDemo {

	public static void main(String[] args) {
		// A bounded blocking queue backed by an array
		// low memory overhead
		// uses a single lock for both enqueue and dequeue operation

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

		Thread producer = new Thread(new producer(queue));
		Thread consumer = new Thread(new consumer(queue));

		// producer.start();
		// consumer.start();

		// Optionally bounded backed by an LinkedList
		// uses a two separate lock for both enqueue and dequeue operation
		// Higher concurrency between producer and consumer

		BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();

		// Binary heap as array and can grow dynamically
		// head is ordered based on the natural order or provided comparator like
		// priority queue
		// unbounded so put wont block.

		BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
		queue2.add("apple");
		queue2.add("banana");
		queue2.add("cherry");
		System.out.println(queue2);

	}

}

class consumer implements Runnable {

	BlockingQueue<Integer> queue;

	private int value = 0;

	consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {

			try {
				Integer value = queue.take();
				System.out.println("Consumer consumed:: " + value);
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Consumer Interrupted::");
			}

		}

	}

}

class producer implements Runnable {

	BlockingQueue<Integer> queue;

	private int value = 0;

	producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Producer produced:: " + value);
			try {
				queue.put(value++);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Producer Interrupted::");
			}

		}

	}

}