package com.java8.examples.inheritance;

public interface InterfaceDefaultMethodExampleB {

	default Double getSum(final double a, final double b) {
		return 2 * (a + b);
	}

	default Double getMultiple(final double a, final double b) {
		return 2 * (a * b);
	}

	default Double getSubs(final double a, final double b) {
		return 2 * (a - b);
	}

	static void staticMethodA() {
		System.out.println("static method from B.");
	}
}
