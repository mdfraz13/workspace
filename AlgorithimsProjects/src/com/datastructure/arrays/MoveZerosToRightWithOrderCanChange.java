package com.datastructure.arrays;

import java.util.Arrays;

public class MoveZerosToRightWithOrderCanChange {

    public static void main(String[] args) {
        int[] a = {10, 0, 0, 1, 0, 5, 9, 0, 8, 8 , 9};
        int l = 0;
        int r = a.length -1;
        while (l < r)
        {
            if (a[l] != 0) {
                l++;
            }

            if (a[r] == 0) {
                r--;
            }

            if (l < r)
            {
               swap(a, l, r);
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] a ,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
