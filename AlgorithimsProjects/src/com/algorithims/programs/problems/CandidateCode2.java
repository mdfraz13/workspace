package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 *  find the largest sum of SUBLIST
 *  8
 *	-2 -3 4 1 24 56 7  8
 * @author mfraz
 *
 */
public class CandidateCode2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N < 3)
			return; 
		//int[] arry = new int[N];
		List<Integer[]> lstSales = new ArrayList<Integer[]>();
		
		for(int i =0;i<N;i++){
			Integer[] line = new Integer[3];
			line[0] = scan.nextInt();
			line[1] = scan.nextInt();
			line[2] = scan.nextInt();
			lstSales.add(line);
		}
		
		Set<Integer[]> sublist = new HashSet<Integer[]>();
		for(Integer[] sales : lstSales){
			int start = sales[0];
			int end = sales[1];
			while(start < end){
				sublist.add(new Integer[]{start,end,sales[2]});
				start++;
			}
			while(start < end){
				sublist.add(new Integer[]{start,end,sales[2]});
				end--;
			}
		}
		
		Map<Integer,List<Integer[]>> map = new HashMap<Integer,List<Integer[]>>();
		for(Integer[] k : sublist){
			if(map.containsKey(k[2])){
				
			}else{
				
			}
		}
		
	}

}
