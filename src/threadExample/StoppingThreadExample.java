package threadExample;

public class StoppingThreadExample {
	public static void main(String[] args) {
		ThreadStop t = new ThreadStop();
		t.start();

		try {
			Thread.sleep(5000);
			t.stopThread();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadStop extends Thread {
	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("Thread is running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread stopped.");
	}

	public void stopThread() {
		running = false;
	}
}
