package com.algorithims.programs.problems.topicwise.stacks;

import java.util.Stack;

public class SortUsingStack {

	public static void main(String[] args) {
		int[] input = {12,28,89,1,14,97,17};
		
		int n = input.length;
		sort(input);
	}
	
	/**
	 *  Using two stacks stack1 and stack2
	 * @param input
	 * @return
	 */
	public static int[] sort(int[] input) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		int n = 0;
		while(n < input.length) {
			stack1.push(input[n++]);
		}
	
		while(!stack1.isEmpty()) {
			int x = stack1.pop();
			while(!stack2.isEmpty() && stack2.peek() > x) {
				stack1.push(stack2.pop());
			}
			stack2.push(x);
		}
				
		System.out.println(stack1.toString());
		System.out.println(stack2.toString());
		return new int[0];
	}

}
