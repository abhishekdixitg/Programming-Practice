package threadExample;

class CommonPool {
	int data = 0;

	boolean hasData = false;

	public synchronized int consume() {
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
		data = value;
		System.out.println("Producer value:: " + data);
		notify();
	}
}

class ConsumerPool implements Runnable {
	CommonPool resource = null;

	ConsumerPool(CommonPool resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			resource.consume();
		}
	}

}

public class ProducerConsumerExample {

	public static void main(String[] args) {
		CommonPool res = new CommonPool();

		Thread producerThread = new Thread(new ProducerPool(res));
		Thread consumerThread = new Thread(new ConsumerPool(res));

		producerThread.start();
		consumerThread.start();
	}

}

class ProducerPool implements Runnable {
	CommonPool resource = null;

	ProducerPool(CommonPool resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			resource.produce(i);
		}
	}

}
