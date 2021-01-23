package com.algorithims.programs.problems.topicwise.dynamicprogramming;

import java.util.ArrayList;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {2,3,5,7};
		int target = 12;
		// {3,7} 
		boolean[][] output = new boolean[arr.length][target];
		System.out.println(output.length+"---"+output[0].length);
		SubsetSum subset= new SubsetSum();
		output =  subset.subsetsum(arr, target);
		if(output[arr.length-1][target]) {
			subset.findPath(output, arr.length-1, output[0].length-1, arr, target);
			for(int x : subset.trackinglist) {
				System.out.print(arr[x]+"-->");
			}
		}else {
			System.out.println("Solution not possible");
		}
	}
	
	public boolean[][] subsetsum(int[] arr,int target) {
		boolean[][] output = new boolean[arr.length][target+1];
		
		// mark first column as true
		for(int i=0;i<output.length;i++) {
			output[i][0] = true;
		}
		
		for(int i=0;i<output[0].length;i++) {
			if(i == arr[0]) {
				output[0][i] = true;
			}
		}
		
		for(int i=1;i<output.length;i++) {
			for(int j=1;j<output[0].length;j++) {
				if(j < arr[i]) {
					output[i][j] = output[i-1][j];
				}else {
					output[i][j] =  output[i-1][j-arr[i]] || output[i-1][j]; 
				}
			}
		}
		
		printTable(output);
		//arr[]  0 1 2 3 4 5 6 7 8 9 	10     
		//2 	 T F T F F F F F F F 	F		i=0
 		//3 	 T F T T F F F F F F 	F
		//5		 T F T T F T F T T F 	F
		//7		 T F T T F T F T F T 	T
		
		// 3,7
		return output;
	}
	
	public void printTable(boolean[][] output) {
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[0].length;j++) {
				System.out.print(" "+(output[i][j] ? "T" : "F"));
			}
			System.out.println("");
		}
	}
	
	ArrayList<Integer> trackinglist = new ArrayList<Integer>();
	private void findPath(boolean[][] output,int i,int j,int[] arr,int target) {
		System.out.println(i+" "+j);
		if(target == 0) {
			System.out.println("Sum is returned 0");
			return;
		}
		
		if(j<0 || i < 0) {
			System.out.println("j reached 0");
			return;
		}
		
		if(i==0 || j==0) {
			trackinglist.add(i);
			return;
		}
	
		if(output[i][j] && output[i-1][j]) {
			findPath(output, i-1, j,arr, target);
		}else if(output[i][j]) {
			trackinglist.add(i);
			findPath(output, i, j-arr[i],arr,target-arr[i]);
		}else {
			findPath(output, i, j-1,arr,target);
		}
		
	}
	
}
