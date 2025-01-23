package threadExample;

class consumer implements Runnable {
	SharedResource resource;

	consumer(SharedResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.consumer();
		}

	}

}

class producer implements Runnable {
	SharedResource resource;

	producer(SharedResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			resource.produce(i);
		}

	}

}

class SharedResource {
	int data = 0;
	boolean hasData = false;

	public synchronized int consumer() {
		while (!hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		hasData = false;
		System.out.println("Consumer value:: " + data);
		notify();
		return data;
	}

	public synchronized void produce(int value) {
		while (hasData) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		hasData = true;
		System.out.println("Produced:: " + data);
		data = value;
		notify();
	}
}

public class ThreadCommunication {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		Thread producerThread = new Thread(new producer(resource));
		Thread consumerThread = new Thread(new consumer(resource));

		producerThread.start();
		consumerThread.start();
	}

}
