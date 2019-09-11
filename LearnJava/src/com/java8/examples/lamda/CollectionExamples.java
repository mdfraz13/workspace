package com.java8.examples.lamda;

import java.util.Arrays;
import java.util.List;

public class CollectionExamples {

	public static void main(String[] args) {
		List<String> lst2 =  Arrays.asList(new String[] {"Java String",null,"Stg Mail","St1g","String Java","String Object","String String","Python String"});
		//lst2.stream().flatMap(e -> Arrays.asList(e.split(" "))
		lst2.stream().filter(s -> (s != null)).sorted().forEach(System.out::println);;
	}

}
