package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *  find the largest sum of SUBLIST
 *  8
 *	-2 -3 4 1 24 56 7  8
 * @author mfraz
 *
 */
public class CandidateCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arry = new int[N];
		for(int i =0;i<N;i++){
			arry[i] = scan.nextInt();
		}
		
		int maxSum = Integer.MIN_VALUE;
		for(int x=0;x<N;x++){
			int sum =arry[x];
			for(int i=x+1;i<N;i++){
				sum += arry[i];
				if(sum > maxSum)
					maxSum = sum;
			}
			
		}
		System.out.println(maxSum);
	}

}
