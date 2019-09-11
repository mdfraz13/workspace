package com.java8.problems;

public class DefaultMethodExample{ //implements I1,I2{

//	@Override
//	public void add(int a, int b) {
//		int c = a + b;
//		System.out.println(c);
//		//return c;
//	}
	
//	public int multiplier(int a) {
//		return I2.super.multiplier(a);
//	}
	
	public static void main(String[] args) {
		DefaultMethodExample df = new DefaultMethodExample();
		//df.add(10,20);
		//System.out.println(df.multiplier(10));
		//System.out.println((int a,int b) -> (a+b));
	}

}
interface I1{
	
	public void add(int a,int b);
	
	default int multiplier(int a) {
		return a * 10;
	}
	
}
interface I2{
	
	public void add(int a,int b);
	
//	default int multiplier(int a) {
//		return a * 20;
//	}
}