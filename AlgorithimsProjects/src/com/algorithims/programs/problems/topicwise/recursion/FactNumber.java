package com.algorithims.programs.problems.topicwise.recursion;

import java.util.Arrays;

public class FactNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 40321;
		int[] a = new int[10];
		System.out.println(fact(10,a));
		//System.out.println(fact(number));
		System.out.println(Arrays.toString(a));
	}
	
	//static int[] a = new int[10];
	static int i = 10;
	private static int fact(int n,int[] a) {
		if(n == 1) return 1;
		//a[--i] = 
		return fact(n-1,a);
	}

}
