package com.concurrency.examples.concurrentpkg;

public class LearnCountDownLatch {
	
	private volatile int count = 0;
	
	public LearnCountDownLatch(int count) {
		this.count = count;
	}
	
	public synchronized void countDown() {
		count--;
		if(count == 0)
			notifyAll();
	}
	
	public synchronized void await() {
		if(count > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}