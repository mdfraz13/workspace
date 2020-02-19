package com.java8.problems.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPoolImpl
{
	private BlockingQueue<Runnable> taskQueue = null;
	List<WorkerThread> workerThreadsInPool = new ArrayList<>();

	public ThreadPoolImpl(int size){
		taskQueue = new ArrayBlockingQueue<>(size);

		for(int i=0;i < size ; i++){
			workerThreadsInPool.add(new WorkerThread(taskQueue));
		}

		for(WorkerThread th : workerThreadsInPool){
			th.start();
		}
	}

	public synchronized void execute(Runnable task){
		taskQueue.add(task);
	}

	public synchronized void shutdown(){
		for(WorkerThread th : workerThreadsInPool){
			th.markStop();
		}
	}

}
class WorkerThread extends Thread{

	private BlockingQueue<Runnable> taskQueue = null;
	private volatile boolean stop = false;

	public WorkerThread(BlockingQueue<Runnable> taskQueue){
		this.taskQueue = taskQueue;
	}

	public void run(){
		while(!stop){
			try {
				Runnable runnable = taskQueue.take();
				runnable.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void markStop(){
		this.stop = true;
	}
}
