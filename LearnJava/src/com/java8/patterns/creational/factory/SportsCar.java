package com.java8.patterns.creational.factory;

public class SportsCar implements Car {

	public SportsCar() {
		System.out.println("sports car initialized.....");
	}

	@Override
	public void getQuotation() {
		System.out.println("....quotation for sports car....");
	}
}
