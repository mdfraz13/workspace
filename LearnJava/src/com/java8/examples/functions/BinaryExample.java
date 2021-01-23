package com.java8.examples.functions;

import java.util.function.BinaryOperator;

public class BinaryExample {

	public static void main(String[] args) {

		BinaryOperator<Integer> binaryOperator = (x , y) -> x + y ;

		System.out.println(binaryOperator.apply(10, 20));

	}
}
