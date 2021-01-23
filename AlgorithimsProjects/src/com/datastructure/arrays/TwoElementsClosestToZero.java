package com.datastructure.arrays;

import java.util.Arrays;

/**
 * Sum Closest to ZERO not equal to zero
 */
public class TwoElementsClosestToZero {

	public static void main(String[] args) {
		int[] input = {10, 21, 0, -10, 4, -3, -14, -12};

		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		getPairElements(input);
	}

	public static void getPairElements(int[] input) {
		int firstIndex = 0;
		int lastIndex = input.length-1;

		int min_sum = Integer.MAX_VALUE;

		int min_f = input[0];
		int min_r = input[0];
		while (firstIndex <= lastIndex) {
			int firstNum = input[firstIndex];
			int lastNum = input[lastIndex];

			int sum = Math.abs(firstNum + lastNum);
			if (sum < min_sum && sum != 0)
			{
				min_sum = sum;
				min_f = firstNum;
				min_r = lastNum;
				firstIndex++;
				lastIndex--;
			}
			else {
				firstIndex ++;
			}
		}

		System.out.println(min_sum + "==> (" + min_f + " , "+ min_r + ")");
	}
}
