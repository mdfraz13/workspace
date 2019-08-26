package com.algorithims.programs.problems;

import java.util.Scanner;

public class kangaruJump {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		
		boolean success = false;
		// x2 always greater than x1
		// v1 always greater than v2
		if(x1 < 0 || x2 < 0 || x2 <= x1 || v1 <= v2 ){
			success = false;
		}else{
			double x = (x2 * v1 - x1 * v2 )/(v1 - v2);
			double fraction = x - Math.floor(x);
			if(fraction < 0.00001){
				success = true;
			}
		}
		
		if(success){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
