package com.java8.examples.functions;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> predicate = x -> x > 10;

		System.out.println(predicate.test(10));

		System.out.println(predicate.and(predicate).test(15));
	}
}
