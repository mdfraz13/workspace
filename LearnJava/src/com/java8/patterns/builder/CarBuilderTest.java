package com.java8.patterns.builder;

public class CarBuilderTest {

	public static void main(String[] args) {
		//final var builder = new Car.CarBuilder("1", "4");
		final var car = new Car.CarBuilder("1", "4")
			 					.setColor("yellow")
							   .setLuxury("super")
							   .build();

		System.out.println(car);
	}
}
