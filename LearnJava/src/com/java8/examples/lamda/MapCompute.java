package com.java8.examples.lamda;

import java.util.HashMap;
import java.util.Map;

public class MapCompute {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "Sabiha");
		map.put("2", "Kamran");
		map.put("3", "Fozia");
		map.put("4", "Fraz");
		map.put("5", "France");
		map.put("6", "Germany");
		
		//map.compute("6",)
		map.compute("1", (k,oldval) -> oldval.concat("put"));
		System.out.println("MapCompute.main()="+map);
		
		map.compute("21", (k,oldval) -> null);
		System.out.println("MapCompute.main()="+map);
		
		map.compute("21", (k,oldval) -> "");
		System.out.println("MapCompute.main()="+map);
		
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		map2.put("Java", 1);
		map2.put("Spring", 1);
		map2.put("REST", 1);	
		map2.compute("Java", (k,oldval) -> ((oldval == 1)? oldval+1 : 0));
		System.out.println("MapCompute.main()="+map2);
		
		map2.computeIfPresent("30", (k,oldval) -> ((oldval == 1)? oldval+1 : 0));
		System.out.println("MapCompute.main()="+map2);
		
		Map<String,String> map3 = new HashMap<String,String>();
		map3.computeIfAbsent("3", k -> k.concat("2"));
		System.out.println("MapCompute.main()="+map3);
		map3.computeIfPresent("3", (k,v) -> v.concat("2"));
		System.out.println("MapCompute.main()="+map3);
		
		
	}

}
