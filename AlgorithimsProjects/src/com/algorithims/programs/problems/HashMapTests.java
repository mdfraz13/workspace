package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class HashMapTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> st = new HashMap<String,String>();
		st.put("a", "a");
		st.put("b", "b");
		st.put("c", "D");
		st.put("c", "K");
		System.out.println(st.keySet().toString());
		System.out.println("====================================");
		Set<String> strSet = st.keySet();
		for(Map.Entry<String,String> l : st.entrySet()) {
			System.out.println(l.getKey()+"--->"+l.getValue());
		}
		LinkedHashMap<String,String> xl = new LinkedHashMap<String,String>();
		TreeMap<String,String> map = new TreeMap<>();
		ArrayList<String> y = new ArrayList<String>();
		/*for(String x : strSet){
			//y.add(x);
			st.remove(x);
		}*/
		
		for(String v : y){
			System.out.println(v);
			st.remove(v);
		}
		System.out.println(st.keySet().toString());
	/*	Vector<String> lst = new Vector<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		
		for(String x : lst){
			lst.remove(lst.size()-1);
		}*/
		List<Integer> ks = new ArrayList<Integer>();
		
		ks.add(2);
		ks.add(10);
		ks.add(3);
		int diff = 0;
		int count = 0;
		for(Integer x : ks){
			if(count++ < 2){
				diff =x - diff;
				System.out.println(diff);
			}
		}
		
		double x1 =  0.2 * 60000;
		System.out.println((long)x1);
		
		//PriorityQueue<Integer> queue = new PriorityQueue<>();
	}

}
