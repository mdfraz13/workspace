package com.java8.patterns.creational.factory;

public class LuxuryCar implements Car {

	public LuxuryCar () {
		System.out.println("initializing luxury cars....");
	}

	@Override
	public void getQuotation() {
		System.out.println("....quotation for luxury car....");
	}
}
