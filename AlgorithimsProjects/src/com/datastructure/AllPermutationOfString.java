package com.datastructure;

import java.util.Arrays;

public class AllPermutationOfString {

	public static void main(String[] args) {
		String input = "ABC";
		char[] in = input.toCharArray();
		permute(in, 0, in.length);
	}

	private static void permute(char[] ar, int l , int r) {

		if (l == r) { System.out.println(Arrays.toString(ar)); }
		for (int i = l; i < r ; i++) {
			swap(ar, l, i);
			permute(ar, l + 1, r);
			swap(ar, l, i);
		}
	}

	private static void swap(char[] ar, int i , int j) {
		char temp  = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
