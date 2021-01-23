package com.concurrency.examples.concurrentpkg;

public class LearnCyclicBarrier {
	
	private int parties;
	private volatile int count;
	private Runnable cyclicRunnable;
	
	public LearnCyclicBarrier(int parties,Runnable cyclicRunnable) {
		this.parties = parties;
		this.count = parties;
		this.cyclicRunnable = cyclicRunnable;
		
	}
	
	public synchronized void await() throws InterruptedException {
		count--;
		if(count > 0) {
			wait();
		}else {
			this.count = parties;
			notifyAll();
			cyclicRunnable.run();
		}
	}

}
