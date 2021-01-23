package com.algorithims.programs.problems.topicwise.Stringbased;

public class SwapTwoStringWIthoutTemp {

	public static void main(String[] args) {
		//String ip1 = "ABC";
		//String ip2 = "CDE";
		
		int ip1 = 10;
		int ip2 = 20;
		swapNum(ip1, ip2);
		
	}

	private static void swap(String ip1 ,String ip2) {
		
	}
	
	private static void swapNum(int ip1 ,int ip2) {
		System.out.println(ip1+" --- "+ip2);
		ip1 = ip1 + ip2;
		ip2 = ip1 - ip2;
		ip1 = ip1 - ip2;
		System.out.println(ip1+" --- "+ip2);
	}
	
}
