package com.concurrency.examples;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class ThreadClientTest {

	
	static int count = 0;
	public static void main(String[] args) {
		ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
		map.put("java1", "java");
		map.put("java2", "java");
		map.put("java3", "java");
		map.put("java4", "java");
		
		
		
		Thread t1 = new Thread(() -> {
			while(count < 10) {
				map.get("java1");
				System.out.println(map+""+ Thread.currentThread());
				count++;
			}
		}) ;
		
		Thread t2 = new Thread(() -> {
			while(count < 10) {
				map.get("java1");
				System.out.println(map +""+ Thread.currentThread());
				count++;
			}
		}) ;
		
		Thread t3 = new Thread(() -> {
			while(count < 10) {
				map.clear();
				System.out.println(map+""+ Thread.currentThread());
				System.out.println(map.isEmpty());
				count++;
			}
		}) ;
		
		t1.start();
		t2.start();
		//t3.start();
		
		
	}
	
	

}
