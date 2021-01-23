package com.java8.patterns.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Car x = CarFactory.getCar("sports");

		if (x != null) {
			x.getQuotation();
		}
	}
}
