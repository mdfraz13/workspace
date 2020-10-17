package com.java8.patterns.builder;

public class Car {

	// mandatory
	private String engine;
	private String wheels;

	// optional
	private String color;
	private String luxury;

	public String getEngine() {
		return engine;
	}

	public String getWheels() {
		return wheels;
	}

	public String getColor() {
		return color;
	}

	public String getLuxury() {
		return luxury;
	}

	private Car(CarBuilder builder) {
		this.engine = builder.engine;
		this.wheels = builder.wheels;
		this.color = builder.color;
		this.luxury = builder.luxury;
	}

	@Override
	public String toString() {
		return "Car{" +
			   "engine='" + engine + '\'' +
			   ", wheels='" + wheels + '\'' +
			   ", color='" + color + '\'' +
			   ", luxury='" + luxury + '\'' +
			   '}';
	}

	public static class CarBuilder {
		// mandatory
		private String engine;
		private String wheels;

		// optional
		private String color;
		private String luxury;

		public CarBuilder(String engine, String wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}

		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		public CarBuilder setLuxury(String luxury) {
			this.luxury = luxury;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
