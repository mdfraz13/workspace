package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.List;

public class StringComtainsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String a = "ABCDEFG";
		String b = "ABC";
		String c = "ABCDEFGH";
		
		System.out.println(a.contains(b));
		System.out.println(a.contains(c));
		System.out.println(c.contains(a));
		
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("a");
		lst.add("a");
		lst.add("b");
		
		lst.remove("a");
		System.out.println(lst.toString());*/
		
		final String e = new String("abc");
		final String f = ""+e;
		final String g = "abc";
		final String h = ""+g;
				
		System.out.println(e == f);
		System.out.println(g == f.intern());
		System.out.println(g == h);
		
	}

}
