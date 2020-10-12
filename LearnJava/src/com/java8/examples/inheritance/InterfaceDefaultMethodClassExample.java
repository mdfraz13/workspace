package com.java8.examples.inheritance;

public class InterfaceDefaultMethodClassExample implements InterfaceDefaultMethodExampleA, InterfaceDefaultMethodExampleB
{
	public Double getSum(final double a, final double b) {
		return a + b;
	}

	public Double getMultiple(final double a, final double b) {
		return a * b;
	}

	public Double getSubs(final double a, final double b) {
		return a - b;
	}

	public void checkStaticMethodA() {
		InterfaceDefaultMethodExampleB.staticMethodA();
	}

}
