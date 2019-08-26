package com.algorithims.programs.problems;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNameCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "C:\\loadheap\\loadheap\\heapdump__EMGC_EMGC_DOMAIN_EMGC_DOMAIN_EMGC_OMS1_jvm_1475680306361.hprof";
		System.out.println(file.lastIndexOf("\\"));
		int lastIndex = file.lastIndexOf("\\");
		file = file.substring(lastIndex + 1);
		System.out.println(file);
		
	}

}
