package com.algorithims.programs.problems;

import java.util.StringTokenizer;

public class SummaryFile {
	
	 public static char JAMEOROW = 0x1e; 
	 static String rowchar = new String(new char[] { JAMEOROW });

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curline = "S^^ 1500280714^^ /EMGC_EMGC_DOMAIN/EMGC_DOMAIN_jvmpool^^ 1500280721139^^ 2017-07-17 14:08:41.139^^ 0^^ 35.318^^ 1^^ loaderjob-work-manager:loaderjob-work-1^^ ^^ ^^ ^^ 18999-114^^ oracle.sysman.core.pbs.gcloader.LoaderjobWorker->doWork^^ LoaderjobWorker.java^^ 252^^ Runnable^^ ^^ ^^ 0^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ ^^ 34826463665_8.14^^ 3143513232_4.03^^ 38099^^ 1753^^ 76076^^ 3883241^^ 11080^^ 0^^ ^^ 8^^ 19841^^ ^^ ^^ ^^ -1^^ 0^^ ^^ ^^ ^^ ^^";
		System.out.println("["+rowchar+"]");
		String x = "^^";
		StringTokenizer fields = new StringTokenizer(curline, x, false);
		int count = 0;
		while(fields.hasMoreTokens()) {
			if(count==0) {
				fields.nextToken();
			}
			System.out.println("["+count+++"]----["+fields.nextToken().trim()+"]");
		}
		
		
	}

}
