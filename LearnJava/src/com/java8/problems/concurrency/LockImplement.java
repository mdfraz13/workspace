package com.java8.problems.concurrency;

public class LockImplement {

	private volatile boolean isLocked = false;
	private volatile Thread currentThread = null;

	public LockImplement(){}

	public synchronized void acquire(){
		try{
			while(isLocked){
				wait();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		currentThread = Thread.currentThread();
		isLocked = true;
		notifyAll();
	}

	public synchronized void release(){
		try{
			while(!isLocked && currentThread != Thread.currentThread()){
				wait();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		currentThread = null;
		isLocked = false;
		notifyAll();
	}

}
