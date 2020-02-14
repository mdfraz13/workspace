package com.datastructure.arrays;

public class FindNumberOfLand {

	public static void main(String[] args) {
		int[][] input = {{1,1,1},{0,0,0},{0,1,1}};

		int numberOfLand = 0;
		for(int i=0;i < input.length; i++){
			for(int j=0; j < input[i].length;j++){
				if(input[i][j] == 1){
					numberOfLand += noOfLandsDfs(input, i , j);
				}
			}
		}
		System.out.println(numberOfLand);
	}

	public static int noOfLandsDfs(int[][] land, int i , int j){

		if(i < 0 || j < 0 || i > land.length-1 || j >= land[i].length-1 || land[i][j] == 0){
			return 0;
		}

		land[i][j] = 0;
		noOfLandsDfs(land, i+1, j);
		noOfLandsDfs(land, i, j+1);
		noOfLandsDfs(land, i-1, j);
		noOfLandsDfs(land, i, j-1);

		return 1;
	}
}
