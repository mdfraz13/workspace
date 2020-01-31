package com.problemsolving.basics.arraybased;

import java.util.Arrays;

public class FindElementInSorted2DArray {

	public static void main(String[] args) {
		int[][] a = {{1,5,6},{35,36,90},{102,103,104}};
		int k = 35;
		int[] result = getFindElementInSorted2DArray(a, k);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getFindElementInSorted2DArray(int[][] a, int k){
		int[] result = new int[2];
		int i=a.length-1;
		int j = 0;
		while(i >= 0){
			while(j < a[i].length){
				System.out.println("i="+i+", j="+j+", a[] = "+a[i][j]);
				if(a[i][j] == k){
					result[0] = i;
					result[1] = j;
					return result;
				}

				if(a[i][j] < k){
					j++;
				}else{
					i--;
				}
			}
		}
		return result;
	}

}
