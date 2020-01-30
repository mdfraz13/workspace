package com.datastructure.sortingalgos.arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = {3, 8, 5, 2, 6, 9, 1, 4};
		sort(input);
	}

	public static void sort(int[] input){
		int temp = 0;
		int max = 0;
		int size = input.length;
		for(int i=0;i < size ;i++){
			for(int j=0;j < size -i ;j++){
				if(input[j] > input[max]){
					max = j;
				}
			}
			swap(input, max, size - i -1);
			System.out.println(Arrays.toString(input));
		}
	}

	public static void swap(int[] a, int i , int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
