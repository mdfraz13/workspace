package com.intigral.programs.basics;

import java.util.Arrays;

public class RecursionSum {

	public static void main(String[] args) {
		int[] a = {12,1,5,0,21,11};
		//int sum  = new RecursionSum().recursiveSum(a, 0, 0);
		int sum = new RecursionSum().recursiveSum2(a, 0);
		System.out.println(sum);

		int[] sum2 = new int[1];
		new RecursionSum().recursiveSum(a, 0, sum2);
		System.out.println(Arrays.toString(sum2));
	}

	public void recursiveSum(int[] a,int i, int[] sum){
		if(i < a.length) {
			sum[0] += a[i];
			i += 1;
			recursiveSum(a, i, sum);
			System.out.println(Arrays.toString(sum));
		}
	}

	public int recursiveSum2(int[] a, int i){
		if(i > a.length-1){
			return 0;
		}
		int sum =  a[i] + recursiveSum2(a, i+1);
		return sum;
	}
}
