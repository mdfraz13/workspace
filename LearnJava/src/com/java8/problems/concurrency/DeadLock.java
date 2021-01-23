package com.java8.problems.concurrency;

/*
	1. Try to acquire lock on resource 1 , then resource 2.
	2. In another thread , Try to lock resource 2 and then resource 1.

 */
public class DeadLock {

	private final static String resource1 = "resource1";
	private final static String resource2 = "resource2";

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			synchronized (resource1) {
				try {
					System.out.println("acquired lock on resource 1 "+ Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println("acquired resource 1 then resource 2 "+ Thread.currentThread().getName());
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (resource2) {
				try {
					System.out.println("acquired lock on resource 2 "+ Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (resource1) {
					System.out.println("acquired resource 1 then resource 2 "+ Thread.currentThread().getName());
				}
			}
		});

		t1.start();
		t2.start();

	}
}
