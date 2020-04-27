package com.problemsolving.dp;

import java.util.HashMap;
import java.util.Map;

/**
 *  0/1 KnapSack problem
 *
 *  price = [1, 6, 10, 15]
 *
 *  	0	1	2	3	4	5	6
 *	Wt
 *	1		1	1	1	1	1	1
 *  2
 * 	3
 * 	5
 */
public class KnapSackProblem01 {

	public static void main(String[] args) {

		int[] w = {1, 2, 3, 7};
		int[] price = {1,5, 3, 16};

		int capacity = 10;

		int[][] table = new int[w.length+1][capacity+1];

		for(int i=1;i <= w.length ; i++){
			for(int j=0;j <= capacity; j++){
				if(w[i-1] > j){
					table[i][j] = table[i-1][j];
				}else{
					table[i][j] = Integer.max(table[i-1][j],table[i-1][j-w[i-1]] + price[i-1]);
				}
			}
		}

		System.out.println(table[w.length][capacity]);
	}

	private static int[] items(int[][] table){
		int[] items = new int[table.length];

		return items;
	}

}
