package com.algorithims.programs.problems.topicwise.stacks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInputUsingStack {

	public static void main(String[] args) {
		int[] input = {4,19,89,16,3,1};
		reverse(input);
		
	}

	private static void reverse(int[] input) {
		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> stck = new Stack<Integer>();
		System.out.println(Arrays.toString(input));
		for(int x : input) {
			stck.add(x);
		}
		
		while(!stck.isEmpty()) {
			q.add(stck.pop());
		}
		
		System.out.println(q.toString());
		
 	}
	
}
