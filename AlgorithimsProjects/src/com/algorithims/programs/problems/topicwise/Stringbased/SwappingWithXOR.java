package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Arrays;

public class SwappingWithXOR {

	public static void main(String[] args) {
		// Integer Swapping 
		int a = 23;
		int b = 3;
		swapInt(a, b);
		
		String x = "ybcdefgz";
		reverseString(x);

	}
	
	private static void swapInt(int x,int y) {
		System.out.println("X == "+x+" Y== "+y);
		y = x ^ y;
		x = x ^ y;
		y = x ^ y;
		System.out.println("X == "+x+" Y== "+y);
	}
	
	private static void reverseString(String x) {
		int l=0,r=x.length()-1;
		char[]  ch = x.toCharArray();
		while(l < r) {
			ch[l] ^= ch[r];
			ch[r] ^= ch[l];
			ch[l] ^= ch[r];
			l++;
			r--;
		}
		System.out.println("---"+new String(ch));
	}

}
