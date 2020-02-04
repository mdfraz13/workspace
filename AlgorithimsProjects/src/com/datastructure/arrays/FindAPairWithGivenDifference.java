package com.datastructure.arrays;

import java.util.Arrays;

public class FindAPairWithGivenDifference {

	public static void main(String[] args) {
		int[] a = {5, 20, 3, 2, 50, 80};
		int k = 78;

		int[] res = findPairWithGivenDifference(a, k);
		System.out.println(Arrays.toString(res));
	}

	public static int[] findPairWithGivenDifference(int[] a, int k){
		int[] result = new int[2];

		Arrays.sort(a); // n log n

		int i = 0;
		int j = 1;
		while(i < a.length && j < a.length){
			int temp = a[i] - a[j] ;
			temp = temp > 0 ? temp : temp * -1;
			System.out.println(temp);
			if(temp < k){
				j++;
			}else if(temp > k){
				i++;
				j = 1;
			}else{
				result[0] = a[i];
				result[1] = a[j];
				break;
			}
		}

		return result;
	}
}
