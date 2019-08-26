package com.algorithims.programs.problems.hackerRank;

public class All_Possible_Combinations 
{
	/**
	 * sequence is the list of Letters
	 * N - is the total number of characters
	 * @param sequence
	 * @param N
	 */
    static void printCombinations(char[] sequence, int N) 
    {
        char[] data = new char[N]; 
        for (int r = 0; r < sequence.length; r++)
            combinations(sequence, data, 0, N - 1, 0, r);
    }
 
    static void combinations(char[] sequence, char[] data, int start, int end,int index, int r) 
    {
 
        if (index == r) 
        {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            System.out.println();
        }
 
        for (int i = start; i <= end && ((end - i + 1) >= (r - index)); i++) 
        {
            data[index] = sequence[i];
            combinations(sequence, data, i + 1, end, index + 1, r);
        }
    }
 
    public static void main(String args[]) 
    {
        char[] sequence = { 'a', 'b', 'c', 'd', 'e' };
        System.out.print("The combinations are: ");
        printCombinations(sequence, sequence.length);
        
        inputstring = "xyz";
        combine();
        System.out.println(output.toString());
    }
    
    private static String inputstring;
    private static StringBuilder output = new StringBuilder();
    
    public static void combine() { combine( 0 ); }
    private static void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
}