package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * Input - Sales start end price
 * 3
	1 5 20
	3 8 15
	7 10 8
	
	output 
	1 2 20
	2 7 15
	7 10 8
 * @author mfraz
 *
 */
public class CandidateCode3 {

	public static <T> void main(String[] args) {
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
		
		Collections.sort(lstSales, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				return o1[2] - o2[2];
				//return 0;
			}
		});
		
		for(Integer[] d : lstSales){
			System.out.println(d[0]+" "+d[1]+" "+d[2]);
		}
		System.out.println("==============================");
		
		int start = lstSales.get(0)[0];
		int end = lstSales.get(0)[1];
		int price = lstSales.get(0)[2];
		
		List<Integer[]> result = new ArrayList<Integer[]>();
		result.add(new Integer[]{start,end,price});
		for(int x=1;x<lstSales.size();x++){
			Integer[] temp = lstSales.get(x);
			if(temp[0] < start){
				if(temp[1] > start){ // end date is greater than smaller than min sale.Merge happens 
					result.add(new Integer[]{temp[0],start,temp[2]});
				}else{
					result.add(new Integer[]{temp[0],temp[1],temp[2]});
				}
			}else{
				if(temp[0] < end && temp[1] > end){
					result.add(new Integer[]{end,temp[1],temp[2]});
				}else{
					result.add(new Integer[]{temp[0],temp[1],temp[2]});
				}
			}
		}
		
		Collections.sort(result,new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		
		for(Integer[] d : result){
			System.out.println(d[0]+" "+d[1]+" "+d[2]);
		}
		
	}

}
