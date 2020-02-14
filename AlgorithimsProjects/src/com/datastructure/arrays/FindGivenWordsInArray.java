package com.datastructure.arrays;

public class FindGivenWordsInArray {

	public static void main(String[] args) {
		char[][] input = {{'a','b','c'},{'d','e','f'},{'a','f','e'}};
		String word = "adef";

		char[] wordArray = word.toCharArray();
		System.out.println(isWordAvailable(input, wordArray));

	}

	public static boolean isWordAvailable(char[][] input, char[] word){

		boolean isfound = false;
		for(int i=0;i < input.length;i++){
			for(int j=0; j < input[i].length; j++){
				if(word[0] == input[i][j]) {
					return isWordAvailableDfs(input, word, "", i, j);
				}
			}
		}

		return isfound;
	}

	public static boolean isWordAvailableDfs(char[][] input, char[] word, String wordSoFar, int i , int j){

		if(i < 0 || j < 0 || i > input.length-1 || j >= input[i].length-1 || input[i][j] == ' '){
			return false;
		}

		String wordStr = new String(word);
		wordSoFar += input[i][j];
		if(wordStr.equals(wordSoFar)){
			return true;
		}

		char temp = input[i][j];
		input[i][j] = ' ';
		boolean found = isWordAvailableDfs(input, word , wordSoFar, i+1, j ) ||
						isWordAvailableDfs(input, word , wordSoFar, i-1, j ) ||
						isWordAvailableDfs(input, word , wordSoFar, i, j+1 ) ||
						isWordAvailableDfs(input, word , wordSoFar, i, j-1 ) ;

		input[i][j] = temp;
		return found;
	}


}
