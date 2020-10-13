package com.java8.problems.concurrency;

public class ThreadPoolImplClient {

	public static void main(String[] args) {
		ThreadPoolImpl threadPool = new ThreadPoolImpl(3);

		for( int i = 0 ;i < 3 ; i ++) {
			Runnable r1 = () -> {
				System.out.println("inside r1 .." + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("exiting .......");
			};

			threadPool.execute(r1);
		}

		threadPool.shutdown();

	}
}