package com.algorithims.programs.problems;


public class SuperClass {
	
	public void someMethod(){
		System.out.println("Some");
		SubClass x = new SubClass();
		x.add();
	}

}
class SubClass extends SuperClass{
	
	public void add(){
		System.out.println("ADD");
		//someMethod();
	}
	
}
