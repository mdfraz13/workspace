package com.java8.problems;

import java.util.stream.IntStream;

public class Loop1 {

	public static void main(String[] args) {
		int n  = 2;
		
		IntStream.range(1, 11).forEach((int i) -> System.out.println("2 x "+i+" = "+(2 * i)));
	}

}
