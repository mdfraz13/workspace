package com.algorithims.programs.problems;

import java.util.regex.Pattern;

public class StringSplitWithPatterns {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		/*String[] xy = s.split(" ");
		for(String x : xy) {
			System.out.println(x);
		}*/
		String[] sp = s.split("[ !,?._'@]+");
		for(String x : sp) {
			System.out.println(x);
		}
	}

}
