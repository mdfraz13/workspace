package com.algorithims.programs.problems.topicwise.backtracking;

public class RatInMaze {
	
	public static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] M = {{1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}};
		
		
		solveMaze(M);
		// start with M[0][0]
		// if M[i][j+1] & M[i+1][j] is not 0
	}
	
	public static void solveMaze(int[][] M) {
		int[][] output = {{0, 0, 0, 0},
		        {0, 0, 0, 0},
		        {0, 0, 0, 0},
		        {0, 0, 0, 0}};
		
		if(!solveMazeUtil(M, 0, 0, output)) {
			System.out.println("No olution foind");
		}
		
		for(int i = 0;i<output[0].length;i++) {
			for(int j=0;j<output[0].length;j++) {
				System.out.print(output[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static boolean isValid(int[][] maze,int i,int j) {
		return (i >=0 && i < N && j >=0 && j < N && maze[i][j] == 1);
	}
	
	public static boolean solveMazeUtil(int[][] M,int i,int j ,int[][] output ) {
		N = M[0].length;
		if(i == N-1 && j == N-1) {
			output[i][j] = 1;
			return true;
		}
		
		if(isValid(M, i, j)) {
			output[i][j] = 1;
			
			if(solveMazeUtil(M, i, j+1, output))
				return true;
			
			if(solveMazeUtil(M, i+1, j, output))
				return true;
			
			output[i][j] = 0;
			return false;
		}
		
		return false;
	}

}
