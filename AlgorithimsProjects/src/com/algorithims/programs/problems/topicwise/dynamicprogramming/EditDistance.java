package com.algorithims.programs.problems.topicwise.dynamicprogramming;

public class EditDistance {

	public static void main(String[] args) {
		String input = "CAT";
		String target = "CUT";
		System.out.println(new EditDistance().editDistance(input, target));
		
	}

	public int editDistance(String input,String target) {
		char[] row = input.toCharArray();
		char[] col = target.toCharArray();
		int ipl = input.length();
		int ol = target.length();
		int[][] output = new int[ol+1][ipl+1];
		
		// initilaize first colum Empty String
		for(int i=0;i<ol;i++) {
			output[i][0] = i;
		}
		
		for(int i=0;i<ipl;i++) {
			output[0][i] = i;
		}
		
		for(int i=1;i<ol;i++) {
			char x = row[i];
			for(int j=1;j<ipl;j++) {
				output[i][j] =  1+ minVal(output[i-1][j-1],output[i-1][j],output[i][j-1]);
			}
		}
		return output[ol][ipl];
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
}
