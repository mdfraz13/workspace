package com.concurrency.examples.executorexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecutorMain {

	public ThreadPoolExecutorMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		Future<String> f = service.submit(new MyCallableTask());
		
		while(!f.isDone()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiting for completion....");
		}
		
		if(f.isDone()) {
			try {
				String val = f.get();
				System.out.println(val);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
class Task implements Runnable{
	
	final String[] str = new String[1]; 	

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			str[0] = "some value ";
			new Thread().interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyCallableTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return "Hey I am OK";
	}
	
}
