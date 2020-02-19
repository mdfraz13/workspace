package com.java8.problems.concurrency;

public class CyclicBarrierImpl {

	private int numberOfpermits = 0;

	public CyclicBarrierImpl(int permits){
		this.numberOfpermits = permits;
	}

	public synchronized void await(){
		numberOfpermits--;
		if(numberOfpermits == 0){

		}else{

		}
	}

}
