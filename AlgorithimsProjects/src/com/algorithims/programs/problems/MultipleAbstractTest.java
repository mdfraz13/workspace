package com.algorithims.programs.problems;

public class MultipleAbstractTest implements intA, intB {

	@Override
	public void x() {
		System.out.println(x);
	}

	public static void main(String... args) {
		MultipleAbstractTest x = new MultipleAbstractTest();
		x.x();

	}

}

abstract class A {

	public void execute() {
		System.out.println("-------A------");
	}
}

abstract class B {

	public void execute() {
		System.out.println("-------B------");
	}

	public static void x() {

	}
}

interface intA {

	// int x = 0;
	public void x();

}

interface intB {
	int x = 10;

	public void x();
}
