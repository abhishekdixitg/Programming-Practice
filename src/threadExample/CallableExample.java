package threadExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) {
		// Create a thread pool with a single thread
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// Define a Callable task
		// sample code anonymous class
		// Callable<Integer> task = new Callable() {
		// @Override
		// public Object call() throws InterruptedException {
		// System.out.println("Performing a computation...");
		// Thread.sleep(2000);
		// return 42;
		// }
		// };

		Callable<Integer> task = () -> {
			System.out.println("Performing a computation...");
			Thread.sleep(2000); // Simulate some delay
			return 42; // The result of the computation
		};

		try {
			// Submit the Callable task and get a Future object
			Future<Integer> future = executorService.submit(task);

			// Do some other work if needed
			System.out.println("Task is submitted. Doing some other work...");

			// Retrieve the result from the Future object
			Integer result = future.get(); // Blocks until the task is complete
			System.out.println("The result of the computation is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Shut down the executor service
			executorService.shutdown();
		}
	}
}
