package com.java8.problems;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

	public static void main(String[] args) {
		//CompletableFuture<String> future = new CompletableFuture<>();
		CompletableFuture<Void> future = CompletableFuture.runAsync(new Task());
		try {
			//future.get();
			TimeUnit.SECONDS.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		future.cancel(true);
		
	}

}
class Task implements Runnable{

	@Override
	public void run() {
		while(Thread.currentThread().isInterrupted()) {
			System.out.println("Runnable PING.....");
		}
	}
}
class TaskCall implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Message : Callable PING....";
	}
	
}