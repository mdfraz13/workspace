package com.java8.problems.concurrency;

public class CountDownLatchImpl {

	private volatile int numberOfPermits = -1;
	public CountDownLatchImpl(int permits){
		this.numberOfPermits = permits;
	}

	public synchronized void await() throws InterruptedException{
		if(numberOfPermits > 0){
			wait();
		}
	}

	public synchronized void countdown(){
		numberOfPermits--;
		if(numberOfPermits == 0){
			notifyAll();
		}
	}

}
