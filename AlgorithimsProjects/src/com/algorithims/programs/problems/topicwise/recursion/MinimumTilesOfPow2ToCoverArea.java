package com.algorithims.programs.problems.topicwise.recursion;

public class MinimumTilesOfPow2ToCoverArea {

	public static void main(String[] args) {
		int m = 10;
		int n = 5;
		System.out.println(minTiles(m, n));
	}
	
	private static int minTiles(int m,int n) {

		if(m == 0 || n == 0) return 0;
		
		if(m%2==0 && n%2==0) {
			return minTiles(m/2, n/2);
		}else if(m%2==1 && n%2==0) {
			return n+minTiles(m/2, n/2);
		}else if(m%2==0 && n%2==1) {
			return m+minTiles(m/2, n/2);
		}else {
			return m+n-1+minTiles(m/2, n/2);
		}
	}

}
