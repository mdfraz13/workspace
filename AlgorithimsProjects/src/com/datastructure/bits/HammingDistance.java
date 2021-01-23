package com.datastructure.bits;

/**
 *  The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 *  Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *
 *  bit1 XOR bit2
 */
public class HammingDistance {

	public static void main(String[] args) {
		final int input1 = 1;
		final int input2 = 3;

		int max =Integer.toBinaryString(Math.max(input1, input2)).length(); //Integer.bitCount(Math.max(input1, input2));
		System.out.println(max);
		int distance = 0;
		for(int i=0;i < max;i++){
			//System.out.println(i);
			//System.out.println(1 << i);
			if(((input1 & (1 << i)) ^ ((input2 & (1 << i)))) != 1){
				distance += 1;
			}
		}
		System.out.println(distance);
	}
}
