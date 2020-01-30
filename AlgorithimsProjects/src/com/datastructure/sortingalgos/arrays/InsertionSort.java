package com.datastructure.sortingalgos.arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = {3, 8, 5, 2, 6, 9, 1, 4};
		sort(input);
	}

	public static void sort(int[] a){
		int temp = 0;
		for(int i=1;i < a.length;i++){
			temp = a[i];
			for(int j=i;j > 0; j--){
				if(a[j] < a[j-1]){
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

}