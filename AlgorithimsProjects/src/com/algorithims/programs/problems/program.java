package com.algorithims.programs.problems;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        // Apples 
        int appleCount = 0;
        for(int i=0;i<apple.length;i++){
            int position = a + apple[i];
            if(position >= s && position <=t ){
                appleCount++;
            }
        }
        
        // Orange
        int orangeCount =0;
        for(int i=0;i<orange.length;i++){
            int position = b + orange[i];
            if(position >= s && position <=t ){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
	}

}
/**
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        // Apples 
        int appleCount = 0;
        for(int i=0;i<apple.length;i++){
            int position = a + apple[i];
            if(position >= s && position <=t ){
                appleCount++;
            }
        }
        
        // Orange
        int orangeCount =0;
        for(int i=0;i<orange.length;i++){
            int position = b + orange[i];
            if(position >= s && position <=t ){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}


*/