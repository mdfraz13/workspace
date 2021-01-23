package com.java8.examples.functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> predicate = (x, y) -> x > y;

		System.out.println(predicate.test(10, 15));
	}
}
