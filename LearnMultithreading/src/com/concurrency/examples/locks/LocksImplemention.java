package com.concurrency.examples.locks;

public class LocksImplemention {
	
	private volatile boolean isLocked = false;
	private Thread currentThread = null;
	
	public synchronized void lock() {
		while(isLocked && currentThread !=Thread.currentThread()) {
			try { 
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		currentThread = Thread.currentThread();
		isLocked = true;
	}
	
	public synchronized void unlock() {
		/*while(isLocked && currentThread ==Thread.currentThread()) {
			
		}*/
		currentThread = null;
		isLocked = false;
		notifyAll();
	}

}
