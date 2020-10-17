package com.java8.patterns.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Car basicCar = new BasicCar();

		Car sportsCar = new SportsCar(basicCar);

		sportsCar.assemble();

		Car luxuryCar = new LuxuryCar(sportsCar);

		luxuryCar.assemble();

	}
}
