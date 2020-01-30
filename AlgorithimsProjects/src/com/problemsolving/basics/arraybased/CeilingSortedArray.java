package com.problemsolving.basics.arraybased;

import java.util.Arrays;

public class CeilingSortedArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 8, 10, 10, 12, 19};
		int  x = 3;
		int[] result = getMinAndMax(a, x);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getMinAndMax(int[] a, int x){
		int[] s = new int[2];
		int l = 0;
		int r = a.length-1;
		while(l < r){

			if(a[l] > x){
				l++;
			}

			if(a[r] < x ){
				r--;
			}
		}
		s[0] = a[l];
		s[1] = a[r];

		return s;
	}


}
