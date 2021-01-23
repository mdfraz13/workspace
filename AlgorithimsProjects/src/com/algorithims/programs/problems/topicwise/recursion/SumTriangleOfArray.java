package com.algorithims.programs.problems.topicwise.recursion;

import java.util.Arrays;

public class SumTriangleOfArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		sumTriangleItr(arr,n);
	}
	
	private static int sumTriangleItr(int[] arr,int n) {
		System.out.println(Arrays.toString(arr));
		if(n == 1) return arr[0];
		
		int[] tArray = new int[n-1];
		for(int i =0;i<n-1;i++) {
			tArray[i] = arr[i] + arr[i+1];
		}
		
		return sumTriangleItr(tArray, n-1);
	}

}
