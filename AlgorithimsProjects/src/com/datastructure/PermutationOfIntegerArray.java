package com.datastructure;

import java.util.Arrays;

public class PermutationOfIntegerArray {

	public PermutationOfIntegerArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {32,23,46,89,91,2,9};
		//swap(input,1,2);
		//System.out.println(Arrays.toString(input));
		permute(input, 0, input.length);
		System.out.println(Arrays.toString(input));
	}
	
	private static void permute(int[] input,int i,int length) {
		//int[] output = {};
		int j = i;
		for(j =i;j<length;j++) {
			swap(input, i, j);
			permute(input, i+1, length);
			swap(input, i, j);
		}
	}
	
	private static void swap(int[] input,int i,int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	

}
