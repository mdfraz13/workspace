package com.java8.problems;

import java.util.Scanner;

public class XmlTagExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            String tagName = line.substring(line.indexOf("<")+1,line.indexOf(">"));
            String startTag = "<"+tagName+">";
            String endTag = "</"+tagName+">";
            
            String tagTextValue = line.substring(line.indexOf(startTag)+startTag.length(), line.indexOf(endTag));
            System.out.println(tagTextValue);
			
			testCases--;
		}
	}

}
