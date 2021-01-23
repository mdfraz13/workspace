package com.java8.problems.concurrency;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LRUCache {

	private final PriorityQueue<String> priorityQueue = new PriorityQueue<>();

	public LRUCache() {}


}
class LRUComparator implements Comparator {

	@Override
	public int compare(Object o, Object t1) {
		return 0;
	}
}
