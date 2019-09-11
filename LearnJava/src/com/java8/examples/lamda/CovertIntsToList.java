package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CovertIntsToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {5,6,7,2,3,5,6,7,9};
		
		//Arrays.stream(a).boxed().collect(Collectors.toList()).forEach(System.out::println);
		
//		IntStream.of(a)
//				//.collect(Collectors.toList())
//				.forEach(System.out::println);
		
		int x = Arrays.stream(a).filter(e -> (e%2 == 0)).sum();
			//.forEach(System.out::println);
		System.out.println(x);
	}

}
