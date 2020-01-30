package com.datastructure.sortingalgos.arrays;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = {3, 8, 5, 2, 6, 9, 1, 4};
		quickSort(input, 0, input.length-1);
	}

	public static void quickSort(int[] a, int low, int high){
		// select a pivot
		if(high < low){
			return;
		}
		if(low < 0 || high > a.length-1){
			return;
		}

		int pivot = a[low];
		int startIndex = low;
		int endIndex = high;
		while(low < high){

			while(a[high] > pivot && high > low){
				System.out.println("high==>"+high);
				high--;
			}

			while(a[low] <= pivot && high > low){
				System.out.println("low==>"+low);
				low ++;
			}

			if(low < high){
				System.out.println("swap "+a[low]+" & "+a[high]);
				swap(a, low, high);
			}
		}
		swap(a, startIndex, high);
		System.out.println(Arrays.toString(a));
		quickSort(a, startIndex, high-1 ); // high become pivot.
		quickSort(a, high+1, endIndex );
	}

	public static void partition(int[] a){

	}

	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


}
