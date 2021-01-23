package com.java8.patterns.creational.singletons;

public class SingletonEagerlyInitialization {

	private static SingletonEagerlyInitialization INSTANCE = new SingletonEagerlyInitialization();

	private SingletonEagerlyInitialization() {
		System.out.println("intializing the singleton....");
	}

	public static SingletonEagerlyInitialization getInstance() {
		return INSTANCE;
	}

}
