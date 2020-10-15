package com.java8.examples.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer> consumer = x ->  {
			System.out.println(x + " --- " + x);
		};

		List x = Arrays.asList(1, 21, 3, 6, 6);

		x.forEach(consumer);
	}
}
