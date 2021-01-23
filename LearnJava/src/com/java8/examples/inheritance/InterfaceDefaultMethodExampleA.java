package com.java8.examples.inheritance;

public interface InterfaceDefaultMethodExampleA {

	default Double getSum(final double a, final double b) {
		return a + b;
	}

	default Double getMultiple(final double a, final double b) {
		return a * b;
	}

	default Double getSubs(final double a, final double b) {
		return a - b;
	}

	static void staticMethodA() {
		System.out.println("static method......");
	}

}
