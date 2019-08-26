package com.algorithims.programs.problems.topicwise.backtracking;

/**
 * Place queeen in chess board such that they do not interact
 * int[][] output = {{ 0,  1,  0,  0},
        { 0,  0,  0,  1},
        { 1,  0,  0,  0},
        { 0,  0,  1,  0}};
 * @author mfraz
 *
 */
public class NQueenProblem {
	
	static int N = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solveQ();
		
	}
	
	/**
	 * Function to initiate the recursive function
	 */
	public static void solveQ() {
		int[][] board = {
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
		};
		
		if(!solveQUtil(board, 0)) {
			System.out.println("Solution not possible");
		}
		
		for(int r=0;r<N;r++) {
			for(int c=0;c<N;c++) {
				System.out.print(board[r][c]+" ");
			}
			System.out.println("");
		}
	}
	
	/**
	 *  Recursive function
	 * @param board
	 * @param y
	 * @return
	 */
	public static boolean solveQUtil(int[][] board,int col) {
				
		if(col >= N) {
			return true;
		}
		
		for(int r=0;r<N;r++) 
		{
			if(isSafe(board, r, col)) {
				board[r][col] = 1;
				
				if(solveQUtil(board, col+1))
					return true;
				
				board[r][col] = 0;
			}
		}
		
		return false;
	}
	
	public static boolean isSafe(int[][] board,int row,int col) {
		
		for(int c=0;c<col;c++) {
			if(board[row][c] == 1) {
				return false;
			}
		}
		
		// left upper
		for(int r=row,c=col;c >= 0 && r>=0;r--,c--) {
			if(board[r][c] == 1)
				return false;
		}
		
		// left dowm
		for(int r=row,c=col;c >= 0 && r<N;r++,c--) {
			if(board[r][c] == 1)
				return false;
		}
		
		return true;
	}

}
