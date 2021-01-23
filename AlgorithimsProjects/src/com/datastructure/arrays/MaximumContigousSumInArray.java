package com.datastructure.arrays;

public class MaximumContigousSumInArray {

	public static void main(String[] args) {
		int[] array = {1, 3, -9, 4, 6, -6, -3};

		int max_so_far = 0;
		int sum_ending_here = 0;
		for (int value : array) {
			sum_ending_here = sum_ending_here + value;
			max_so_far = Math.max(max_so_far, sum_ending_here);

			if (sum_ending_here < 0) {
				sum_ending_here = 0;
			}
		}
		System.out.println(max_so_far);
	}
}
