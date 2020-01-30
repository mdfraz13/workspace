package com.problemsolving.basics.arraybased;

import java.util.Arrays;

public class DutchFlagProblem {

	public static void main(String[] args) {
		int[] a = {1, 0, 0, 1, 2,2,1,1,0, 0, 1,2};
		int l = 0;
		int mid = 0;
		int r = a.length-1;
		while(mid < r){
			switch (a[mid]){
				case 0 :
					swap(a, l, mid);
					mid++;
					l++;
				case 1:
					mid++;
				case 2:
					swap(a, mid, r);
					mid ++;
					r--;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void swap(int[] a, int i , int j){
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}
}
