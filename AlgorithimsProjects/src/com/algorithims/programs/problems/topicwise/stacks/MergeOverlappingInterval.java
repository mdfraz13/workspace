package com.algorithims.programs.problems.topicwise.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,3}, {2,4}, {5,7}, {6,8}} ;
		List<Interval> lst = new ArrayList<Interval>();
		for(int[] a : arr) {
			Interval v = new Interval();
			v.setStart(a[0]);
			v.setEnd(a[1]);
			lst.add(v);
		}
		//1. Sort the entire array based on start time
		Collections.sort(lst,new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				if(o1.getStart() > o2.getStart()) {
					return 1;
				}else if(o1.getStart() > o2.getStart()) {
					return -1;
				}
				return 0;
			}

		});
		//System.out.println(lst.toString());
		
		
		//2. If end time 1st is 
	}
	
	private static int[][] mergedOverlappingInterval(int[][] arr){
		int[][] result = new int[arr[0].length][arr.length];
		
		
		
		return result;
	}
}
class Interval {
	
	private int start;
	private int end;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}