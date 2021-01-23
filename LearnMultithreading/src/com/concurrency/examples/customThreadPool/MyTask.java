package com.concurrency.examples.customThreadPool;

public class MyTask implements Runnable {

	public MyTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+" -->>> COMPLETED");
	}
	
}
