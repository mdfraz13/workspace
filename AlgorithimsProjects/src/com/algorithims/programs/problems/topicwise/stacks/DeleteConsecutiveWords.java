package com.algorithims.programs.problems.topicwise.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeleteConsecutiveWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ab aa aa bcd ab";
		List<String> list = new ArrayList<String>();
		for(String str : input.split(" ")) {
			list.add(str);
		}
		System.out.println(list.toString());
		int n = list.size();
		for(int i=0;i<n-1;) {
			if(list.get(i).equals(list.get(i+1))) {
				list.remove(i);
				list.remove(i);
				
				if(i>0)
					i --;
				
				n = n-2;
			}else {
				i++;
			}
		}
		
		System.out.println(list.toString());
		
	}

}
