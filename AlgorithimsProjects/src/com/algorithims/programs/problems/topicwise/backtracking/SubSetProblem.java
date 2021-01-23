package com.algorithims.programs.problems.topicwise.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * To find subset of a problem having Total of K
 * input = {5,4,31,7} -- 36
 * out put = {5,31}
 * @author mfraz
 *
 */
public class SubSetProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,3,31,1};
		int target_sum = 36;
		findSubset(input, target_sum);
	}
	
	public static void findSubset(int[] input,int target_sum) {
		List<Integer> output = new ArrayList<Integer>();
		//boolean found = false;
		Arrays.sort(input);
		if(!findSubsetUtil(input,0,1, target_sum, output))
		{
			System.out.println("Solution not found");
		}else {
			for(int x =0;x<output.size();x++) {
				System.out.print(x+" ");
			}
		}
	}
	
	public static boolean findSubsetUtil(int[] input,int start,int end ,int target_sum,List<Integer> output) {
		
		if(target_sum == 0) {
			return true;
		}
		
		for(int i=start;i<end;i++) {
			if(findSubsetUtil(input,i+1,end, target_sum-input[i], output))
				return true;
		}
		
		return false;
	}
	
	

}
