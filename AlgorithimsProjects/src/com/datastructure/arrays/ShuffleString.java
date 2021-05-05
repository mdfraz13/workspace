package com.datastructure.arrays;

public class ShuffleString {

    public static void main(String[] args) {
        String s = "codeleet";
        char[] sA = s.toCharArray();
        int[] r = {4,5, 6, 7,0, 2, 1, 3};
        char[] result = new char[r.length];
        for(int i=0; i < result.length ;i ++) {
            int indexInArray = r[i];
            result[indexInArray] = sA[i];
        }
        System.out.println(result);
    }
}
