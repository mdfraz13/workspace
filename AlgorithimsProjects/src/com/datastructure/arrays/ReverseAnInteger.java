package com.datastructure.arrays;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int input = 1534236469;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		if (input >= max || input <= min) {
			System.out.println("min or max == returning 0");
			return;
		}
		
		boolean isNegative = input > 0 ? false : true;
		
		int x = Math.abs(input);
		System.out.println(x);
		int reversedInt = 0;
		while (x > 0) {
			int value = x % 10;
			reversedInt = reversedInt * 10 + value;
			x = x / 10;
		}
		
		System.out.println(isNegative ? -1 * reversedInt : reversedInt);
		
	}

}
