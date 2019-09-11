package com.java8.examples.lamda;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("/", "file:", ".txt");
		sj.add("2006");
		sj.add("11");
		sj.add("05");
		System.out.println(sj.toString());
	}

}
