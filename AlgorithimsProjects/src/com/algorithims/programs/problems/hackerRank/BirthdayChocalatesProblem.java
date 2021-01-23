package com.algorithims.programs.problems.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocalatesProblem {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 1, 3, 2};
		int m = 2;
		int d = 3;
		/*int[] arr = new int[] {4};
		int m = 1;
		int d = 4;*/
		
		int count = 0;
		for(int i=0;i<=(arr.length - m);i++) {
			int tSum = arr[i];
			for(int x=1;x<m;x++) {
				tSum = tSum + arr[i + x];
			}
			//System.out.println(tSum);
			if(tSum == d) {
				count++;
			}
		}
		System.out.println(count);
	}

}
