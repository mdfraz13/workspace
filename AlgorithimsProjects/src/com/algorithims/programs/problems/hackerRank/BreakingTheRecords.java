package com.algorithims.programs.problems.hackerRank;

public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {10,5,20,20,4,5,2,25,1};
		int[] arr = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		
		int highScore = 0;
		int numOfTimeHighScore = 0;
		int lowScore = 0;
		int numOfTimeLowScore = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(i == 0 ) {
				highScore = arr[0];
				lowScore = arr[0];
			}else {
				if(arr[i] > highScore) {
					highScore = arr[i];
					numOfTimeHighScore++;
				}
				if(arr[i] < lowScore) {
					lowScore = arr[i];
					numOfTimeLowScore++;
				}
			}
		}
		System.out.println(numOfTimeHighScore +" === "+numOfTimeLowScore);

	}

}
