package com.java8.patterns.structural.decorator;

public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.println("created basic car ......");
	}
}
