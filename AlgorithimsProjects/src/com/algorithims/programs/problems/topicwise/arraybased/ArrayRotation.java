package com.algorithims.programs.problems.topicwise.arraybased;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = {1,3,5,19,12,18,4};
		int k = 2;
		int n = arr.length;
		int[] x = rotate1(arr,k,n);
		System.out.println(Arrays.toString(x));
	}
	
	private static int[] rotate(int[] arr,int k,int n) {
		int[] result = new int[n];
		
		int i = 0;
		while(i < (n-k)) {
			result[i] = arr[k+i];
			i++;
		}
		
		while(i < n) {
			result[i] = arr[k-1];
			i++;
		}
		
		return result;
	}

	private static int[] rotate1(int[] arr,int k,int n) {
		int[] result = new int[n];
		int[] temp = new int[k];
		
		for(int i=0;i<k;i++) {
			temp[i] = arr[i];
		}
		
		for(int i=k;i<n;i++) {
			arr[i-k] = arr[i];
		}
		
		int v = k;
		int i = 0;
		while(i < k) {
			arr[n-v] = temp[i++];
			v--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		return result; 
	}


}
