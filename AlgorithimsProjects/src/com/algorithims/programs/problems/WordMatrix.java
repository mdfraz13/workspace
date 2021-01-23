package com.algorithims.programs.problems;

import java.util.ArrayList;
import java.util.List;

public class WordMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st = new String[]{"A#A#K","A#S#K","A#K#K"};
		String word = "ASK";
		
		int r = st.length;
		int c = st[0].split("#").length; 
		
		String[][] dst = new String[r][c];
		for(int i=0;i<r;i++){
			String tRow = st[i];
			String[] tRowC = tRow.split("#");
			for(int j=0;j<c;j++){
				dst[i][j] = tRowC[j];
				System.out.print(dst[i][j]+" ");
			}
			System.out.println("");
		}
		
		getMatches(dst,word);
	}
	
	private static int getMatches(String[][] dst,String word){
		
		int count = 0;
		List<String> lstWord = new ArrayList<String>();
		for(int i=0;i<dst.length;i++){
			String tempWord = "";
			
				tempWord = dst[i][i]+dst[i][i+1]+dst[i][i+2]; // Horizontal
				lstWord.add(tempWord);
				tempWord = dst[i][i]+dst[i+1][i+1]+dst[i+2][i+2]; // diagonal
				lstWord.add(tempWord);
				tempWord = dst[i][i]+dst[i+1][i+1]+dst[i+2][i+2]; // diagonal
		}
		
		
			
		return count;
	}

}
