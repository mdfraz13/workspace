package com.algorithims.programs.problems.topicwise.stacks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {100, 80, 60, 70, 60, 75, 85};
		StockSpanProblem span = new StockSpanProblem();
		
		
		int[] out = span.getSpanDetails(input);
		System.out.println(Arrays.toString(out));
	}
	
	public int[] getSpanDetails(int[] input) {
		int[] s = new int[input.length];
		int[] span = new int[input.length];
		for(int i=0;i<input.length;i++) {
			int j = 1;
			//while(input[i] > )
		}
		return s;
	}

}
