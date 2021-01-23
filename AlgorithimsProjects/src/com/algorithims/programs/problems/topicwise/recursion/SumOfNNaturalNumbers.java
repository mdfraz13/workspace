package com.algorithims.programs.problems.topicwise.recursion;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n,0));
	}
	
	public static int sum(int n,int sum) {
		if(n == 0) return sum;
		
		return sum(n-1,sum+n);
		
	}

}
