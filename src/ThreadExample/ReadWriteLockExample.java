package ThreadExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

	public static final ReadWriteLock lock = new ReentrantReadWriteLock();

	public static final Lock readLock = lock.readLock();

	public static final Lock writeLock = lock.writeLock();

	public static void main(String[] args) throws InterruptedException {
		ReadWriteLockExample re = new ReadWriteLockExample();

		Runnable readTask = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + " read:: " + re.getCount());
				}

			}
		};
		Runnable writeTask = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					re.increment();
					System.out.println(Thread.currentThread().getName() + " incremented ");
				}

			}
		};

		Thread writerThread = new Thread(writeTask, "Thread 1");
		Thread readerThread1 = new Thread(readTask, "Thread 2");
		Thread readerThread2 = new Thread(readTask, "Thread 3");
		writerThread.start();
		readerThread1.start();
		readerThread2.start();

		writerThread.join();
		readerThread1.join();
		readerThread2.join();

		System.out.println("Final count:: " + re.getCount());
	}

	int counter = 0;

	public int getCount() {
		readLock.lock();
		try {
			return counter;
		} finally {
			readLock.unlock();
		}
	}

	public void increment() {
		writeLock.lock();
		try {
			counter++;
			// System.out.println(Thread.currentThread().getName() + counter);
		} finally {
			writeLock.unlock();
		}
	}
}
