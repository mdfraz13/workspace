package com.java8.problems.concurrency;

public class CyclicBarrierImpl {

	private int partiesAwait = -1;
	private int initialParties = -1;

	public CyclicBarrierImpl(int parties){
		this.partiesAwait = parties;
		this.initialParties = parties;
	}

	public synchronized void await() throws InterruptedException{
		partiesAwait--;
		if(partiesAwait > 0){
			wait();
		}else{
			this.partiesAwait = initialParties;
			notifyAll();;
		}
	}

}
