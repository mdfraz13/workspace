package com.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class AsyncProcess {

	public static void main(String[] args) {
		CompletableFuture.runAsync(() -> someHeavyTasksWithoutReturn());

		CompletableFuture<String> result = null;
		CompletableFuture<String> result2 = null;
		try {
			result = CompletableFuture
				.supplyAsync(() -> someHeavyTasksWithReturn())
				.whenComplete((s1, s2) -> {
					if(s1.equalsIgnoreCase("faraz")){
						System.out.println("correct  --------");
						//s2.printStackTrace();
					}else{
						s2.printStackTrace();
					}
				});

			result2 = CompletableFuture.supplyAsync(() -> someHeavyTasksWithReturn2());

			System.out.println(result.get());
		}catch (Exception e){}

		final var s = CompletableFuture.allOf(result, result2);
		System.out.println(s);
	}

	public static void someHeavyTasksWithoutReturn(){
		System.out.println("someHeavyTasksWithoutReturn ----- ");
		try{
			Thread.sleep(1000);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("someHeavyTasksWithoutReturn finished----- ");
	}

	public static String someHeavyTasksWithReturn(){
		System.out.println("someHeavyTasksWithReturn ====== ");
		try{
			Thread.sleep(1000);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("someHeavyTasksWithReturn finished ===== ");
		return "faraz";
	}

	public static String someHeavyTasksWithReturn2(){
		System.out.println("another one  ====== ");
		try{
			Thread.sleep(1000);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("another one finished ===== ");
		return "Sabiha";
	}

}
