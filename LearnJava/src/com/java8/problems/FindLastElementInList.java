package com.java8.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindLastElementInList {

	public static void main(String[] args) {
		int[] input = {12,1,3,46,7,212,121,90,89};
		//Stream.of(input);
		IntStream intStream = Arrays.stream(input);
		
		// convert Stream to Linked List
		//intStream.peek(System.out::println).collect(supplier, accumulator, combiner)

		List list = intStream.boxed().collect(Collectors.toList());
	}

}
