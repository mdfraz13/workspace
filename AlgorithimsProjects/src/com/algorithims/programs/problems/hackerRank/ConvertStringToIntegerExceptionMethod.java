package com.algorithims.programs.problems.hackerRank;

public class ConvertStringToIntegerExceptionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "999";
		try {
			int y = Integer.parseInt(x);
			System.out.println(y);
		}catch(NumberFormatException e) {
			System.out.println("Bad String");
		}
		
	}

}
