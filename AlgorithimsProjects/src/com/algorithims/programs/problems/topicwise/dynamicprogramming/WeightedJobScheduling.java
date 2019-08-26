package com.algorithims.programs.problems.topicwise.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightedJobScheduling {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[][] = {{3, 10, 20}, {1, 2, 50}, {6, 19, 100}, {2, 100, 200}};
		/*List<Job> jobs = new ArrayList<Job>();
		jobs.add(new Job(3, 10, 20));
		jobs.add(new Job(1, 2, 50));
		jobs.add(new Job(6, 19, 100));
		jobs.add(new Job(2, 100, 200));
		
		Collections.sort(jobs, new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				if(o1.getEnd() < o2.getEnd()) {
					return -1;
				}else if(o1.getEnd() == o2.getEnd()){
					return 0;
				}
				return 1;
			}
		});
		
		int[] arr = new int[jobs.size()];
		for(int i=0;i<end;i++) {
			for() {
				
			}
		}*/
		int arr[][] = {{3, 10, 20}, {1, 2, 50}, {6, 19, 100}, {2, 100, 200}};
	}
	
	public int jobscheduling(int[][] input) {
		int[] output = new int[input.length];
		
		for(int i=0;i<output.length;i++) {
			int endval = input[i][1];
			
		}
		
		return 0;
	}

}
class Job{
	
	private int start;
	private int end;
	private int price;
	
	public Job(int start,int end,int price) {
		this.start = start;
		this.end = end;
		this.price = price;
	}
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}