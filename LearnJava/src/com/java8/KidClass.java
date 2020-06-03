package com.java8;

public class KidClass {

	public static void main(String[] args) {
		String xyz = "Test\t";
		System.out.println(xyz);
		xyz = xyz.trim();
		//xyz = xyz.replaceAll("\\r\\n\\t","");
		System.out.println(xyz);
	}
}
