package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubSetOfGivenSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] set = {"a","b","c"};
		printAllSubset(set);
		/*Set<ArrayList<String>> x= AllSubset(set);
		for(ArrayList<String> x1 : x){
			System.out.println(x1.toString());
		}
		ArrayList<ArrayList<String>> y = new ArrayList<ArrayList<String>>(x);
		Collections.sort(y,new Comparator<ArrayList<String>>() {

			@Override
			public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                ArrayList<String> o1List = (ArrayList<String>)o1;
                ArrayList<String> o2List = (ArrayList<String>)o2;
                if(o1List.size() > o2List.size())
                {
                    return -1;
                }else if(o1List.size() < o2List.size())
                {
                    return 1;
                }
				return 0;
			}
		});
		System.out.println("=====================================");
		for(ArrayList<String> x1 : y){
			System.out.println(x1.toString());
		}*/
		
	}
	
	private static void printAllSubset(String[] set){
		int n = set.length;
		
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
        	System.out.println(i);
            // Print current subset
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
            System.out.println("");
        }
	}
	
	private static Set<ArrayList<String>> AllSubset(String[] set){
		int n = set.length;
		Set<ArrayList<String>> subsets = new HashSet<ArrayList<String>>();
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            // Print current subset
        	ArrayList<String> s = new ArrayList<String>();
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0){
                    s.add(set[j]);
                } 
            if(!s.isEmpty())
            	subsets.add(s);
        }
        return subsets;
	}

}
