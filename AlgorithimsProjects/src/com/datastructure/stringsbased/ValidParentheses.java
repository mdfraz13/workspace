package com.datastructure.stringsbased;

import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final var str = "[({2})]";
		System.out.println(isValid(str));
	}

	public static boolean isValid(String s) {
		final var stack = new LinkedList<Character>();

		if (s == null || s.isBlank())
			return true;

		int i = 0;
		boolean success = true;
		char[] chr = s.toCharArray();
		while (i < chr.length) {

			char c = chr[i];
			switch (c) {
			case '[':
			case '{':
			case '(':
				stack.push(c);
				break;
			case ')':
				if (!stack.isEmpty()) {
					if (stack.peek().charValue() != '(') {
						success = false;
					} else {
						stack.pop();
					}
				} else {
					stack.push(c);
				}
				break;
			case '}':
				if (!stack.isEmpty()) {
					if (stack.peek().charValue() != '{') {
						success = false;
					} else {
						stack.pop();
					}
				} else {
					stack.push(c);
				}
				break;
			case ']':
				if (!stack.isEmpty()) {
					if (stack.peek().charValue() != '[') {
						success = false;
					} else {
						stack.pop();
					}
				} else {
					stack.push(c);
				}
				break;
			}

			// System.out.println(stack);
			i++;
			if (!success)
				return false;
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
