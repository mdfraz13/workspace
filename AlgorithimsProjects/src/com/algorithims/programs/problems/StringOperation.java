package com.algorithims.programs.problems;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] rowLabels = new String[]
                { "LOCK", "CPU", "DB", "NET", "IO", "RMI","Other" };
        
        //List<String> rowList = (ArrayList<String>) Arrays.asList(rowLabels);
        List<String> rowList = new LinkedList<String>();
        for(String x : rowLabels){
        	if(!x.equals("DB")){
        		rowList.add(x);
        	}	
        }
        System.out.println(rowList.toString());
        
        String x = "";
        System.out.println(x.isEmpty());
        System.out.println("".equals(x));
        
        String[] y = new String[x.length()];
        y = rowList.toArray(y);
        for(String s : y){
        	System.out.println(s);
        }
        
        int col = 0;
        String[] xx = new String[5];
        xx[col++] = "1";
        xx[col++] = "2";
        xx[col++] = "3";
        xx[col++] = "4";
        xx[col++] = "5";
        System.out.println(xx[4]);
        
        System.out.println(System.getProperty("os.name"));
                
        String dat1 = "June 24 2017 20:02 0";
        String val1 = dat1.substring(0,dat1.indexOf(":")+3);
        String valx = dat1.substring(dat1.indexOf(":")+4,dat1.length());
        System.out.println("["+valx+"]"+"["+val1+"]");
        try {
			System.out.println(formateDate(val1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String x1 = null;
        
	}
	
	
	public static String formateDate(String dateStr1) throws java.text.ParseException
	{
	       String dateStr = dateStr1.replace(",","");
               DateFormat writeFormat = new SimpleDateFormat("MMMM dd yyyy hh:mm aaa");
        
        Date date1 = null;
        try{
        	DateFormat readFormat = new SimpleDateFormat("MMMM dd yyyy HH:mm");
        	date1 = readFormat.parse(dateStr);
        	System.out.println("==============="+date1);
        }
        catch(ParseException e){
        		DateFormat readFormat = new SimpleDateFormat("MMMM dd yyyy HH:mm");
				date1 = readFormat.parse(dateStr);
        }
        String formattedDate = "";
        if( date1 != null ) 
        	formattedDate = writeFormat.format( date1 );
        
        System.out.println("==============="+formattedDate);

        return formattedDate;
	}

}
