package com.java8.examples;

public class VarArgsExample {

	public static void main(String[] args) {

	}

	public static int add(int...args) {
		int x = args.length;
		int i = 0;
		int sum = 0;
		while (i < x) {
			sum += args[i];
		}
		return sum;
	}
}
