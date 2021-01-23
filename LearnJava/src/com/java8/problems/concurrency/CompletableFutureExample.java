package com.java8.problems.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

	public static void main(String[] args) {

		final var f1 = CompletableFuture.runAsync(() -> {
			try {
				//future.get();
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		f1.cancel(true);


		final var f2 = CompletableFuture.supplyAsync(() -> {
			final var s = "message ------";
			System.out.println("--->>>> calling  supplyAsync...." +Thread.currentThread().getName());
			try {
				//future.get();
				TimeUnit.SECONDS.sleep(5);
				System.out.println(s);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s;
		}).thenApplyAsync((s) -> {
			try{
				System.out.println("--->>>> calling thenApplyAsync ...." +s +" Thread --- "+Thread.currentThread().getName());
				s = s.replaceAll("e", "E");
				TimeUnit.SECONDS.sleep(5);
				System.out.println(s);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return s;
		}).thenApply((s) -> {
			try{
				System.out.println("--->>>> calling thenApply ...." +s+" Thread --- "+Thread.currentThread().getName());
				s = s.replaceAll("m", "M");
				TimeUnit.SECONDS.sleep(5);
				System.out.println(s);
			}catch (Exception e) {
				e.printStackTrace();
			}
			if(1==1)
				throw new RuntimeException("OOOPS");

			return s;
		}).whenComplete((s, e) -> {
			System.out.println("--->>>> calling when complete ...." +s+" Thread --- "+Thread.currentThread().getName());
			if(e == null) {
				System.out.println("NO ERROR");
			}else {
				e.printStackTrace();
			}
		});

		try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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