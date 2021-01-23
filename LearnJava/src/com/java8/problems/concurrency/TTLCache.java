package com.java8.problems.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class TTLCache {

	private final ConcurrentHashMap<String, TTLCacheObject> keyValueMap = new ConcurrentHashMap<>();

	public TTLCache() {
		Runnable r = () -> {
			while (true) {
				try {
					TimeUnit.SECONDS.sleep(10);
					final var currentTimestamp = System.currentTimeMillis();
					//System.out.println(" currentTimestamp " + currentTimestamp);
					for (final var k : keyValueMap.entrySet()) {
						final var valueobj = k.getValue();
						if (valueobj.getCurrentTime() < currentTimestamp) {
							System.out.println("--- deleting key --- " + k.getKey());
							keyValueMap.remove(k.getKey());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(r).start();
	}

	public void put(String key, String value , long timeToLive)
	{
		final var valueObject = new TTLCacheObject(System.currentTimeMillis() + timeToLive, value);
		keyValueMap.put(key, valueObject);
	}

	public String get(String key)
	{
		return keyValueMap.get(key) != null ? keyValueMap.get(key).getValue() : null;
	}


}
class TTLCacheObject {

	private long currentTime;
	private String value;

	public TTLCacheObject(long currentTime, String value) {
		this.currentTime = currentTime;
		this.value = value;
	}

	public long getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}