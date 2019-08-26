package com.algorithims.programs.problems.hackerRank;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String x = Integer.toBinaryString(num);
		System.out.println(x);
		
		char prevValue = '1';
		int max = 0;
		boolean found = false;
		int count = 0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i) == '1') {
				count++;
				found = true;
			}else {
				if(found) {
					
				}
			}
		}
	}

}
