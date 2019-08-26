package com.algorithims.programs.problems.topicwise.Stringbased;

import java.util.Arrays;

public class WeightedUniformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
        String s = "abccddde";
        //int n = 6;
        int[] n = {1,3,12,5,9,10};
        
        char[] input = s.toCharArray();
        int[] arr = new int[input.length];
        arr[0] = input[0] - 'a'+1;
        for(int i=1;i<input.length;i++){
            int current = input[i] - 'a'+1;
            if(input[i-1] == input[i]){
                arr[i] = arr[i-1]+current;
            }else{
                arr[i] = current;
            }
        }
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        for(int a0 = 0; a0 < n.length; a0++){
            int x = n[a0];
            if(Arrays.binarySearch(arr,x) > -1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
                
        }
	}

}
