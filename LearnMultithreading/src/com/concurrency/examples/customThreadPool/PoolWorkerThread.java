package com.concurrency.examples.customThreadPool;

import java.util.concurrent.BlockingQueue;

public class PoolWorkerThread extends Thread
{
	private BlockingQueue<Runnable> queue ;
	private volatile boolean isStopped = false;
	
	public PoolWorkerThread(BlockingQueue<Runnable> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		while(!isStopped) {
			try {
				Runnable task = queue.take();
				//System.out.println(Thread.currentThread()+"... To start executing the Task");
				System.out.println(this);
				task.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		isStopped = true;
	}

}
