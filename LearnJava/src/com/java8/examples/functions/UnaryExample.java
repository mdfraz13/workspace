package com.java8.examples.functions;

import java.util.function.UnaryOperator;

public class UnaryExample {

	public static void main(String[] args) {

		UnaryOperator<Integer> unaryfunc = x -> x * 3;

		System.out.println(unaryfunc.apply(10));
	}
}
