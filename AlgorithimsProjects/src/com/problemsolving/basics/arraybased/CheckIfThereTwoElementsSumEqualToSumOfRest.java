package com.problemsolving.basics.arraybased;

import java.util.Arrays;

public class CheckIfThereTwoElementsSumEqualToSumOfRest {

	public static void main(String[] args) {
		int[] a = {2, 11, 5, 1, 4, 7};
		System.out.println(getData(a));
	}

	public static boolean getData(int[] a){

		int totalSum = 0;
		for(int i=0;i < a.length;i++){
			totalSum += a[i];
		}

		// if odd return false
		if(totalSum%2 != 0) return false;

		int halfSum = totalSum / 2;
		System.out.println("halfsum ==>>> "+halfSum);
		return printPairWithSum(a, halfSum);
	}

	public static boolean isPairSumAvailable(int[] a, int sum){
		int i=0;
		int j=1;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		while(i < a.length && j < a.length){
			int currSum = a[i] + a[j];
			System.out.println(currSum+" ==> "+i+","+j);
			if(currSum > sum){
				j=1;
				i++;
			}else if(currSum < sum){
				j++;
			}else{
				System.out.println(currSum+" return ==> "+i+","+j);
				return true;
			}
		}

		return false;
	}

	public static boolean printPairWithSum(int[] a, int sum){
		int l = 0;
		int r = a.length - 1;
		while(l < r){
			int currSum = a[l] + a[r];
			if(currSum == sum){
				System.out.println("l "+l+", r "+r+", sum = "+currSum);
				return true;
			}

			if(currSum > sum){
				r --;
			}else{
				l++;
			}
		}
		return false;
	}


}
