package com.algorithims.programs.problems;

import java.text.NumberFormat;
import java.util.Locale;

public class StaticInterfaceKlass implements StaticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StaticInterface.test();
		double x = Math.pow(2, 16);
		System.out.println(x);*/
		String val = "12,345.00";
		double amount = Double.parseDouble(val.replaceAll(",", ""));
		Locale localeUS = new Locale("en", "US");      
		NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(localeUS);
		System.out.println(currencyFormatter1.format(amount));
		
		Locale localeInd = new Locale("en", "in");      
		NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(localeInd);
		System.out.println(currencyFormatter2.format(amount));
		 
		NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(currencyFormatter3.format(amount));
		
		Locale localeFr = new Locale("fr", "FR");      
		NumberFormat currencyFormatter4 = NumberFormat.getCurrencyInstance(localeFr);
		System.out.println(currencyFormatter4.format(amount));
		
		
		
		
	}

}
