package com.java8.patterns.creational.factory;

public class CarFactory {

	public static Car getCar(String type)
	{
		if ("sports".equalsIgnoreCase(type)) {
			return new SportsCar();
		} else if ("luxury".equalsIgnoreCase(type)) {
			return new LuxuryCar();
		}

		return null;
	}

}
