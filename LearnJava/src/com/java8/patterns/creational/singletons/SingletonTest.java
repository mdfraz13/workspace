package com.java8.patterns.creational.singletons;

public class SingletonTest {

	public static void main(String[] args) {

		SingletonEnum instance = SingletonEnum.getInstance();

		SingletonEnum instance2 = SingletonEnum.SINGLETON_ENUM;

		System.out.println(instance == instance2);

		// Singleton Eagerly
		SingletonEagerlyInitialization instance3 = SingletonEagerlyInitialization.getInstance();
		SingletonEagerlyInitialization instance4 = SingletonEagerlyInitialization.getInstance();

		System.out.println(instance3 == instance4);


		// Singleton Lazy
		SingletonLazyInitialization instanceLazy1 = SingletonLazyInitialization.getInstance();
		SingletonLazyInitialization instanceLazy2 = SingletonLazyInitialization.getInstance();

		System.out.println(instanceLazy1 == instanceLazy2);
	}
}
