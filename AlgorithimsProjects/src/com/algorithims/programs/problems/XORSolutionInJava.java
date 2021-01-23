package com.algorithims.programs.problems;

public class XORSolutionInJava {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,6};
		int n = a.length;
		/*int i = 1;
		int xor = 0;
		for(int x : arr) {
			 xor += x ^ i;
			i++;
			//System.out.println("X="+Integer.toBinaryString(x)+",n="+Integer.toBinaryString(n));
			System.out.println("X="+x+", XOR="+xor);
		}
		System.out.println("Missing Number "+xor);*/
		
		
		int i;
        int x1 = a[0]; 
        int x2 = 1; 
         
        /* For xor of all the elements 
           in array */
        for (i = 1; i< n; i++) {
            x1 = x1^a[i];
            System.out.print("X1="+x1+" ");
        }
        System.out.println();         
        /* For xor of all the elements 
           from 1 to n+1 */        
        for ( i = 2; i <= n+1; i++) {
            x2 = x2^i;
            System.out.print("X2="+x2+" ");
        }
        System.out.println();
        System.out.println("Missing Number "+(x1^x2));
	}

}
