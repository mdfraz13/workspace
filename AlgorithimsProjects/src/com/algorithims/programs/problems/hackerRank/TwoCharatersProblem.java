package com.algorithims.programs.problems.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharatersProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "beabeefeab";
		List<Character> chars = new ArrayList<Character>();
		
		for(Character c : word.toCharArray()) {
			if(!chars.contains(c)) {
				chars.add(c);
			}
		}
		
		for(Character c : chars) {
			
		}
	}
	

}
