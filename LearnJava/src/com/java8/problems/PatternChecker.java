package com.java8.problems;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.*;

public class PatternChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your codecha
            char[] chararry = pattern.toCharArray();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isInvalid = false;
            for(char c : chararry){
            	if(c == '(' || c == '{' || c == '[') {
            		stack.push(c);
            	}else if(c == ')' ) {
            		if(stack.pop() != '(') { 
            			isInvalid = true;
            			break;
            		}
            	}else if(c == '}' ) {
            		if(stack.pop() != '{') { 
            			isInvalid = true;
            			break;
            		}
            	}else if(c == ']' ) {
            		if(stack.pop() != '[') { 
            			isInvalid = true;
            			break;
            		}
            	}
            }
            if(isInvalid ||  !stack.isEmpty()) {
            	System.out.println("Invalid");
            }else {
            	System.out.println("Valid");
            }
		}
	}
}