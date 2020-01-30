package com.problemsolving.basics.stringsbased;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	final static ExecutorService exec = Executors.newWorkStealingPool(10);

	public static void main(String[] args) throws Exception {
		for(int i=0;i< 10;i++){
			exec.submit(() -> {
				System.out.println(" ==> "+Thread.currentThread().getName());
			});
		}
		exec.awaitTermination(10000, TimeUnit.MILLISECONDS);
	}

}
