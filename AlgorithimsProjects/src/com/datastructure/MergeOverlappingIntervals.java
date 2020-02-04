package com.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * [1,4] [3,6] [8,10] []
 * @author Faraz
 *
 */
public class MergeOverlappingIntervals {
	
	public static void main(String[] args) {
		int[][] input = {
				{1,4},{3,4},{3,6},{5,7},{8,10}
		};
		
		List<Interval> lst = new ArrayList<>();
		for(int[] r : input) {
			Interval i = new Interval();
			i.start = r[0];
			i.end = r[1];
			lst.add(i);
		}
		
		Collections.sort(lst, (Comparator<? super Interval>) (Interval i1,Interval i2) -> i1.start - i2.start );
		
		//System.out.println(lst.toString());

		Stack<Interval> stack = new Stack<>();
		List<Interval> newlist = new ArrayList<>();
		stack.add(lst.get(0));
		for(Interval x : lst) {
			if(x.start < stack.peek().end) {
				Interval t = stack.pop();
				t.end = x.end; // update the end	
				stack.push(t);
			}else {
				//Interval t = x;
				stack.push(x);
			}
		}
		
		while(!stack.isEmpty()) {
			newlist.add(stack.pop());
		}
		Collections.sort(newlist, (Comparator<? super Interval>) (Interval i1,Interval i2) -> i1.start - i2.start );
		System.out.println(newlist.toString());
	}
	
	//private static void 

}
class Interval{
	
	int start;
	int end;
	
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
}
