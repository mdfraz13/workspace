package com.intigral.programs.basics;

public class StringUniqueChars {

	public static void main(String[] args) {
		String str = "ABCCCAA";
		boolean[] bchar = new boolean[52];
		for(char c : str.toCharArray()){
			if((c >= 'a' && c < 'z') || (c >='A' && c < 'Z')){
				int index = c - 65;
				if(bchar[index]){
					System.out.println(c +" Already present ..");
					break;
				}else{
					bchar[index] = true;
				}
			}
		}
	}
}
