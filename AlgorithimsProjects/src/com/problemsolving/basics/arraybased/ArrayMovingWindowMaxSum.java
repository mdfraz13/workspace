package com.problemsolving.basics.arraybased;

public class ArrayMovingWindowMaxSum {

	public static void main(String[] args) {
		int[] a = {34, 1 , 12 , 19, 24, 14, 0};
		int windowSize = 3;
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i< windowSize; i++){
			currentSum += a[i];
		}

		for(int i=1; i <= a.length - windowSize; i++){
			currentSum = currentSum - a[i-1] + a[i+windowSize-1];
			if(currentSum > maxSum){
				maxSum = currentSum;
			}
		}
		System.out.println(maxSum);
	}
}
