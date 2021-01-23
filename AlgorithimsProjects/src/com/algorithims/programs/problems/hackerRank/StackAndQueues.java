package com.algorithims.programs.problems.hackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueues {

	public static void main(String[] args) {
		
		String input = "racecar";
		// TODO Auto-generated method stub
		char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}

}
class Solution{
	
	Stack<Character> stack = new Stack<Character>();
	Queue<Character> queue = new LinkedList<Character>();
	
	public void pushCharacter(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z')) {
			stack.add(c);
		}
	}
	
	public void enqueueCharacter(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z')) {
			queue.add(c);
		}
	}
	
	public char popCharacter() {
		return stack.pop();
	}
	
	public char dequeueCharacter() {
		return queue.poll();
	}
	
}
