package threadExample;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ConsumerLock implements Runnable {
	SharedResourceLock resource;

	ConsumerLock(SharedResourceLock resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.consumer();
		}

	}

}

class ProducerLock implements Runnable {
	SharedResourceLock resource;

	ProducerLock(SharedResourceLock resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.produce(i);
		}

	}

}

class SharedResourceLock {
	int data = 0;
	boolean hasData = false;

	Lock lock = new ReentrantLock();
	Condition notFill = lock.newCondition();
	Condition notEmpty = lock.newCondition();

	public int consumer() {
		lock.lock();
		try {
			while (!hasData) {
				try {
					notFill.await();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			hasData = false;
			System.out.println("Consumer value:: " + data);
			notEmpty.signal();
		} finally {
			lock.unlock();
		}
		return data;
	}

	public void produce(int value) {
		lock.lock();
		try {
			while (hasData) {
				try {
					notEmpty.await();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			hasData = true;
			System.out.println("Produced:: " + data);
			data = value;
			notFill.signal();

		} finally {
			lock.unlock();
		}

	}
}

public class ThreadCommunicationWithLock {

	public static void main(String[] args) {
		SharedResourceLock resource = new SharedResourceLock();

		Thread producerThread = new Thread(new ProducerLock(resource));
		Thread consumerThread = new Thread(new ConsumerLock(resource));

		producerThread.start();
		consumerThread.start();
	}

}
