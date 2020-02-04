package com.problemsolving.basics.arraybased;

/**
 * Window Problem
 */
public class MaximumConsecutiveSum {

	public static void main(String[] args) {
		int[] a = {14, 12 , 1 , 90, 43, 10};
		int windowSize  = 3;

		System.out.println(getStartIndexToEndIndexConsecutiveSum(a, windowSize));
	}

	public static int getStartIndexToEndIndexConsecutiveSum(int[] a, int k){
		int currSum = 0;
		int maximumSum = 0;
		for(int i=0;i< k ;i++){
			currSum += a[i];
		}

		for(int i=1;i< a.length - k+1;i++){
			currSum = currSum + a[i+k-1] - a[i-1];
			if(maximumSum < currSum){
				maximumSum = currSum;
			}
		}

		return maximumSum;
	}
}
