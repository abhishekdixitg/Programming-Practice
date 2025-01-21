package ThreadExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

	public static final Lock lock = new ReentrantLock(true);

	public void inner() {
		lock.lock();
		try {
			System.out.println("Inside inner method");

		} finally {
			lock.unlock();

		}
	}

	public void outer() {
		lock.lock();
		try {
			System.out.println("Inside outer method");
			inner();
		} finally {
			lock.unlock();
		}
	}
}
