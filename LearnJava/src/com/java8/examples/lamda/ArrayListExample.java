package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> input1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> input2 = Arrays.asList(3,4);

		int[] a = {1, 2, 3, 4, 5};

		for(int x : a){
			if(x == 2){
				continue;
			}
			System.out.println(x);
		}
	}
}
