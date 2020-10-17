package com.java8.patterns.singletons;

public class SingletonLazyInitialization {

	private static volatile SingletonLazyInitialization INSTANCE = null;

	private SingletonLazyInitialization() {
		System.out.println("intializing the singleton..now");
	}

	public static SingletonLazyInitialization getInstance() {
		if(INSTANCE == null)
		{
			synchronized (SingletonLazyInitialization.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = new SingletonLazyInitialization();
				}
			}
		}

		return INSTANCE;
	}

}
