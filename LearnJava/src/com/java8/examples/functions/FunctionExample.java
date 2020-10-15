package com.java8.examples.functions;

import java.math.BigInteger;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<Integer, Integer> func1 = x -> x + 2;

		System.out.println(func1.apply(27));

		// chaining of function
		Function<Integer, String> func2 = x -> Integer.toBinaryString(x);

		String result = func1.andThen(func2).apply(29);
		System.out.println(result);
	}

}
