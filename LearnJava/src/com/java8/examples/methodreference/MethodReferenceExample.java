package com.java8.examples.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("2","7","8","9","9");
		s.stream().map(k -> k.toLowerCase()).forEach(System.out::println);
		s.stream().distinct().map(String::toLowerCase).forEach(System.out::println);
		
		
	}

}
