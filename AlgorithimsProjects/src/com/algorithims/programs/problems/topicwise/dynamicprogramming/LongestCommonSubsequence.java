package com.algorithims.programs.problems.topicwise.dynamicprogramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABCDGH";
		String b = "ACDFHR";
		
		char[] ar = a.toCharArray();
		char[] br = b.toCharArray();
		int n = ar.length;
		int k = br.length;
		LongestCommonSubsequence se = new LongestCommonSubsequence();
		System.out.println(se.lcs(ar, br, n, k));
		
	}
	
	public int lcs(char[] x ,char[] y,int n,int k) {
		
		int[][] output = new int[n+1][k+1];
		
		// Initiate first clumn 
		for(int i=0;i<=k;i++) {
			output[i][0] = 0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(x[i-1] == y[j-1]) {
					output[i][j] = 1 + output[i-1][j-1];
				}else {
					output[i][j] = Math.max(output[i-1][j],output[i][j-1]);
				}
			}
		}
		
		printTable(output);
		
		return output[n][k];
	}
	
	public void printTable(int[][] output) {
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[0].length;j++) {
				System.out.print(" "+output[i][j]);
			}
			System.out.println("");
		}
	}
	
}
