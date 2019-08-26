package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class ArraySubSet {

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 1;
		arr[5] = 3;
		
		//List<ArrayList<Integer>> lstOfSubset = new ArrayList<ArrayList<Integer>>();
		Set<ArrayList<Integer>> lstOfSubset = new HashSet<ArrayList<Integer>>();
		
		// Create a list of Subsets of numbers 
		// Logic Create random sets 
		// Use these sets and filter them
		// Find max length.
		/*for(int i=0;i<arr.length;i++){
			ArrayList<Integer> lstSet = new ArrayList<Integer>();
			for(int x=0;x<=i;x++){
				lstSet.add(arr[x]);
			}
			
			lstOfSubset.add(lstSet);
		}*/
		
		for(int i=0;i<arr.length;i++){
			ArrayList<Integer> lstSet = new ArrayList<Integer>();
			for(int x=0;x<=i;x++){
				lstSet.add(arr[x]);
			}
			lstOfSubset.add(lstSet);
			
			
			ArrayList<Integer> lstSet1 = new ArrayList<Integer>();
			for(int x=i;x<=arr.length-1;x++){
				lstSet1.add(arr[x]);
			}
			lstOfSubset.add(lstSet1);
		}
		
		// Filtering of Arralist
		Set<ArrayList<Integer>> finalSet = new HashSet<ArrayList<Integer>>();
		for(ArrayList<Integer> arlst :lstOfSubset){
			Set<Integer> max2set = new HashSet<Integer>(arlst);
			if(arlst.size() > 1 && max2set.size() <= 2){
				finalSet.add(arlst);
			}
		}
		
		System.out.println(lstOfSubset.toString());
		System.out.println(finalSet.toString());
		
		int max = 0;
		for(ArrayList<Integer> arlst :finalSet){
			max = Math.max(max, arlst.size());
		}
		System.out.println(max);
	}
}