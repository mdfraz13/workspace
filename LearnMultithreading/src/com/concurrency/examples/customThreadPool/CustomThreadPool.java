package com.concurrency.examples.customThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomThreadPool {
	
	private BlockingQueue<Runnable> QUEUE;
	//private List<PoolWorkerThread> lstWorkerThread = new ArrayList<>();
	PoolWorkerThread[] workers;
	private int size = 0;
	/**
	 * Constructor
	 * @param size
	 */
	public CustomThreadPool(int size) {
		QUEUE = new ArrayBlockingQueue<Runnable>(size);
		
		for(int i=0;i < size ;i++) {
			PoolWorkerThread worker = new PoolWorkerThread(QUEUE);
			//workers[i] = new PoolWorkerThread(QUEUE);;
			//workers[i].start();
			worker.start();
		}
	}
	
	public void execute(Runnable task) {
		try {
			QUEUE.put(task);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void shutdown() {
		for(int i=0;i < size ;i++) {
			workers[i] = null;
		}
	}

}
