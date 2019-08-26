package com.algorithims.programs.problems.hackerRank;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "999";
        int number = 0;
        for(int i=0;i<S.length();i++){
            char x = S.charAt(i);
            int val  = x-'0';
            int n =1;
            for(;n<=i;n++){
                n *= 10;
            }
            number +=val * n;
        }
        System.out.println(number);
	}

	
}
