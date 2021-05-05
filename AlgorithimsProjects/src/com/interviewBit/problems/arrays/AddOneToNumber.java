package com.interviewBit.problems.arrays;

import java.util.Arrays;

/**
 * Add one to Number
 * {1, 2, 3} ==> {1, 2, 4}
 *
 * {9, 9, 9} ==> {1, 0, 0, 0}
 *
 */
public class AddOneToNumber {

    public static void main(String[] args) {
        int[] a = {9, 9, 9};
        int i = 0;
        int r = a.length -1;
        while (r >= 0) {
            if(a[r] >= 0 && a[r] < 9) {
                a[r] = a[r] + 1;
                r = -1;
            }
            else if (a[r] == 9)
            {
                if (r == 0)
                {
                    int[] newA = new int[a.length + 1];
                    newA[r] = 1;
                    a = newA;
                }
                else
                {
                    a[r] = 0;
                }
                r--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
