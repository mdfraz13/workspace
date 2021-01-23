package com.algorithims.programs.problems.hackerRank;

public class CaeserCipher {

	public static void main(String[] args) {
		String s = "middle-Outz";
		int offset = 2;
		offset = offset % 26;
		String newword = getWord(offset, s);
		/*char[] newword = new char[x.length()];
		for(int i=0;i<x.length();i++) {
			char c = x.charAt(i);
			if(c >= 'a' && c <='z') {
				int ascii = (int)c;
				ascii = ascii + offset;
				char newchar =  (char)ascii;
				if(newchar > 'z') {
					int val = (int)newchar - (int)'z';
					newchar = (char)((int)'a' + (val - offset)+1);
				}
				newword[i] = newchar;
			}else if(c >='A' && c <='Z'){
				int ascii = (int)c;
				ascii = ascii + offset;
				char newchar =  (char)ascii;
				if(newchar >= 'Z') {
					int val = (int)newchar - (int)'Z';
					newchar = (char)((int)'A' + (val - offset)+1);
				}
				newword[i] = newchar;
			}else {
				newword[i] = c;
			}
		}*/
		System.out.println(new String(newword));
	}
	
	public static String getWord(int offset,String s) {
		offset = offset % 26;
		char[] newword = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int ascii = (int)c;
			if(ascii >=97 && ascii <= 122) {
				ascii = ascii + offset;
				if(ascii > 122) {
					ascii = 96 + (ascii - 122);
				}
				newword[i] = (char)ascii;
			}else if(ascii >=65 && ascii <= 90) {
				ascii = ascii + offset;
				if(ascii > 90) {
					ascii = 64 + (ascii - 90);
				}
				newword[i] = (char)ascii;
			}else {
				newword[i] = c;
			}
		}
		//System.out.println(new String(newword));
		return new String(newword);
	}

}
 