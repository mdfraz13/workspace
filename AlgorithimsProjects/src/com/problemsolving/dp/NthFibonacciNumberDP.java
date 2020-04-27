package com.problemsolving.dp;

public class NthFibonacciNumberDP {

	public static void main(String[] args) {
		int a = 20;
		System.out.println(nthFibonacci(a));
	}

	private static int nthFibonacci(int n){
		int[] f = new int[n+2];
		if(n <= 1){
			return n;
		}
		f[0] = 0;
		f[1] = 1;
		int i = 2;
		while(i <= n){
			f[i] = f[i-1] + f[i-2];
			System.out.println(f[i]);
			i++;
		}
		return f[n];
	}
}
