package com.java8.examples.functions;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<Integer, Integer , Integer> func1 = (x, y) -> x + y;

		System.out.println(func1.apply(2, 10));

		System.out.println(func1.andThen(x -> 10 * x).apply(2, 10));
	}
}
