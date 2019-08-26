package com.algorithims.programs.problems.hackerRank;

import java.util.Scanner;

public class SolutionForString {

    static String super_reduced_string(String s){
        if(s==null || s.length() == 0)
            return "Empty String";
            
        boolean ischanged = false;
        // remove adjacent characters
        int[] indexTobeRemoved = new int[2];
         for(int i=0;i<s.length()-1;i++){
             char first = s.charAt(i);
             char next = s.charAt(i+1);
             if(first == next) {
            	 indexTobeRemoved[0] = i;
            	 indexTobeRemoved[1] = i+1;
            	 ischanged = true;
            	 break;
             }
         }
         
         if(ischanged) {
	         String s1 = s.substring(0, indexTobeRemoved[0]);
	         String s3 = s.substring(indexTobeRemoved[1]+1, s.length());
	         s = s1.concat(s3);
	         s = super_reduced_string(s);
         }
         return s;
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String s = in.next();*/
    	String s = "aaabccba";
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}