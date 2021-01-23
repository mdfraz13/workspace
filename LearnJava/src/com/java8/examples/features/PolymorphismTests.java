package com.java8.examples.features;

import java.io.IOException;

public class PolymorphismTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = null;
		int a = x;
		
		
	}

}
class A {
	
	 Number m() throws Exception{
		return null;
	}
}
class B extends A {
	
	@Override
	protected Integer m() throws IOException{
		return null;
	}
}