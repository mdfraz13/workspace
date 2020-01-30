package com.java8.examples.multithreading;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureExample {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		//long startTime = System.currentTimeMillis();
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			long startTime = System.currentTimeMillis();
			try {
				Thread.sleep(10000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("--- I am completed----");
			System.out.println(System.currentTimeMillis() - startTime);
		});
		//future.get();

		System.out.println("completed ====>>> ");

		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(10000);
			}catch(Exception e){
				e.printStackTrace();
			}
			return "Inside the Future..";
		});
		while(!future1.isDone()){
			System.out.println("Waiting..");
			Thread.sleep(1000);
		}
		String s = future1.get();
		System.out.println(s);

		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(10000);
			}catch(Exception e){
				e.printStackTrace();
			}
			return "Inside the Future..";
		}).thenApplyAsync((k)-> {
			System.out.println("Inside another future ...");
			return k.replace("Future","Next Future");
		});

		while(!future2.isDone()){
			System.out.println("Waiting further .... ");
			Thread.sleep(2000);
		}
		String m = future2.get();
		System.out.println(m);

		// final DateTimeFormatter df = DateTimeFormatter
		// 	.ofPattern("ddMMyyyyHHmmss");
		// String activityTimeVal  = "29092019181307";
		// Timestamp ts;
		// if (activityTimeVal != null)
		// {
		// 	ts = Timestamp.valueOf(LocalDateTime.parse(activityTimeVal, df));
		// }
		// else {
		// 	//log.info("did not find any activity time in notification. setting now()");
		// 	ts = Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC")));
		// }
		// System.out.println(ts);
	}

}
