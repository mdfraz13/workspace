package com.algorithims.programs.problems.topicwise.dynamicprogramming;

public class ClosetPath {

	public static void main(String[] args) {
		int[][] input = {{1, 2, 3},
		                {4, 8, 2},
		                {1, 5, 3} };
		
		int x = new ClosetPath().minCostPath(input);
		System.out.println(x);
	}
	
	public int minCostPath(int[][] input) {
		int m = input[0].length;
		int n = input.length;
		int[][] output = new int[m][n];
		
		output[0][0] = input[0][0];
		
		// initialize first column
		for(int i=1;i<m;i++) {
			output[i][0] = output[i-1][0] + input[i][0]; 
		}
		
		// initialize first Row
		for(int i=1;i<n;i++) {
			output[0][i] = output[0][i-1] + input[0][i]; 
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				output[i][j] = minVal(output[i-1][j],output[i-1][j-1],output[i][j-1]) + input[i][j];
			}
		}
		printvalues(output);
		
		return output[m-1][n-1];
	}
	
	public int minVal(int x,int y,int z) {
		int min =0;
		if(x > y) {
			min = y > z ? z : y; 
		}else {
			min = x > z ? z : x;
		}
		
		return min;
	}
	
	public void printvalues(int[][] output) {
		for(int i=0;i<output[0].length;i++) {
			for(int j=0;j<output.length;j++) {
				System.out.print(" "+output[i][j]);
			}
			System.out.println("");
		}
	}

}
