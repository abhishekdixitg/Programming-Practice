package threadExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Executing task " + i);
			try {
				Thread.sleep(1000); // Simulate some work
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Task interrupted");
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() + " - Task Completed");
	}
}

public class ThreadPoolExample {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		ExecutorExample task1 = new ExecutorExample();
		ExecutorExample task2 = new ExecutorExample();
		ExecutorExample task3 = new ExecutorExample();
		ExecutorExample task4 = new ExecutorExample();
		ExecutorExample task5 = new ExecutorExample();

		// Submit tasks to executor and store futures
		Future<?> future1 = executor.submit(task1, "Task1 Success");
		Future<?> future2 = executor.submit(task2, "Task2 Success");
		Future<?> future3 = executor.submit(task3, "Task3 Success");
		Future<?> future4 = executor.submit(task4, "Task4 Success");
		Future<?> future5 = executor.submit(task5, "Task5 Success");

		// Process future results
		try {
			System.out.println("Result of Task 1: " + future1.get());
			System.out.println("Result of Task 2: " + future2.get());
			System.out.println("Result of Task 3: " + future3.get());
			System.out.println("Result of Task 4: " + future4.get());
			System.out.println("Result of Task 5: " + future5.get());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Main thread interrupted");
		} catch (ExecutionException e) {
			System.out.println("Exception occurred while executing task: " + e.getMessage());
		} finally {
			// Shutdown the executor
			executor.shutdown();
			System.out.println("Executor service shut down");
		}

		System.out.println("Executor completed");
	}
}
