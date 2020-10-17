package com.java8.patterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Car x = CarFactory.getCar("sports");

		if (x != null) {
			x.getQuotation();
		}
	}
}
