package com.datastructure.arrays;

public class FindAFixedPoint {

	public static void main(String[] args) {
		int[] a = {-10, -5, 0, 3, 7};
		int x = 2;
		System.out.println(isFixedPointAvailable(a, x));

	}

	public static boolean isFixedPointAvailable(int[] a, int k){
		int i =0;
		while(i < a.length){
			if(a[i] == k) return true;
			i++;
		}
		return false;
	}
}
