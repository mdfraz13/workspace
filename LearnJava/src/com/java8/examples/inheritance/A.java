package com.java8.examples.inheritance;

public class A {
	
	private final int a = 20;
	
	public A(int a){
	//	this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	
	
	public static void main(String[] args) {
		A a = new B(20);
		System.out.println(a.getA());
		System.out.println(a.a);
		
		B b = new B(20);
		System.out.println(b.getA());
		System.out.println(b.a);
	}

}
final class B extends A{

	int a = 0;
	
	public B(int a) {
		super(a);
		//this.a = a;
	}
	
	@Override
	public int getA() {
		return a;
	}
	
	public void modifyInt() {
		this.a = 15;
	}
	
}
