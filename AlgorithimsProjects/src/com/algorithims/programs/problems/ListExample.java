package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args){
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		
		String x = null;
		try{
			x.length();
			//throw new RuntimeException("I ma here");
		}catch(NullPointerException y){
			System.out.println("======================");
			
		}catch(Exception ef){
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		}
		
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
	
	}
	
}
class customeE extends Exception{

	public customeE(){
		super();
	}
	
}
