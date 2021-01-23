package com.java8.problems.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Semaphore :
 *
 * In synchronized block , Only one thread is allowed. There is no flexibilty that multiple thread enters the code.
 *
 * With Semaphore , We can defined multiples thread enter a block of code i.e permits
 */
public class SemaphoreExample {

	private Semaphore semaphore1 = new Semaphore(3); // Three threads at a time
	private volatile int count = 0;

	public void checkSemaphore() throws InterruptedException
	{
		try {
			semaphore1.acquire();
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("count === " + (count++) + " Thread Name " + Thread.currentThread().getName());
			System.out.println(semaphore1.availablePermits());
		} finally {
			semaphore1.release();
			System.out.println("releasing...."+ Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws Exception{
		SemaphoreExample sp = new SemaphoreExample();
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0 ; i < 10; i++) {
			executorService.submit(() -> {
				try {
					sp.checkSemaphore();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

		executorService.awaitTermination(10, TimeUnit.SECONDS);

		executorService.shutdown();
	}
}
