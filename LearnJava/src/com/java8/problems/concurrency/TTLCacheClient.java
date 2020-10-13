package com.java8.problems.concurrency;

import java.util.concurrent.TimeUnit;

public class TTLCacheClient {

	public static final void main(String[] args) throws InterruptedException {
		TTLCache cache = new TTLCache();

		cache.put("12", "One Two", 30000);
		cache.put("123", "One Two Three", 3000);
		cache.put("13", "One Three", 30000000);

		System.out.println("-------------------------------");
		System.out.println(cache.get("12"));
		System.out.println(cache.get("123"));
		System.out.println(cache.get("13"));

		TimeUnit.SECONDS.sleep(30);

		System.out.println("-------------------------------");
		System.out.println(cache.get("12"));
		System.out.println(cache.get("123"));
		System.out.println(cache.get("13"));

		TimeUnit.SECONDS.sleep(300);

		System.out.println("-------------------------------");
		System.out.println(cache.get("12"));
		System.out.println(cache.get("123"));
		System.out.println(cache.get("13"));


	}
}
