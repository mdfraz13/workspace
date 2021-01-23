package com.datastructure.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] a = {1, 10, 20, 50, 100};
		int[] b = {1, 2 , 3, 60, 70, 1000};
		int[] resultArray = mergeSortedArrays(a, b);
		System.out.println(Arrays.toString(resultArray));
	}

	private static int[] mergeSortedArrays(int[] a , int[] b){
		int lenOfNewArray = a.length + b.length - 1;
		int[] resultArray = new int[lenOfNewArray];

		int count = 0;
		int ai = 0;
		int bi = 0;
		while(count < lenOfNewArray){

			if(ai < a.length && bi < b.length && a[ai] > b[bi]){
				resultArray[count] = b[bi];
				count++;
				bi++;
			}

			if(ai < a.length && bi < b.length && a[ai] < b[bi]){
				resultArray[count] = a[ai];
				count++;
				ai++;
			}

			if(ai < a.length && bi < b.length && a[ai] == b[bi]) {
				resultArray[count] = a[bi];
				count++;
				ai++;
				bi++;
			}

			if(ai >= a.length){
				resultArray[count] = b[bi];
				count++;
			}

			if(bi >= b.length){
				resultArray[count] = a[ai];
				count++;
			}

			//System.out.println("count == "+count+" , ai = "+ai+ ", bi = "+bi );

			//System.out.println(Arrays.toString(resultArray));
		}

		return resultArray;
	}
}
