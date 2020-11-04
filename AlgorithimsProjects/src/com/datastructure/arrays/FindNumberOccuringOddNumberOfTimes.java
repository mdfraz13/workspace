package com.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOccuringOddNumberOfTimes {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 2, 3, 1, 3};

		Map<Integer, Integer> map = new HashMap<>();
		for (int key : input) {
			map.compute(key, (k,v) -> v !=null ? v+1 : 1);
		}

		for (var entrySet : map.entrySet()) {
			if (entrySet.getValue() % 2 == 1) {
				System.out.println(entrySet.getKey());
			}
		}
	}
}
