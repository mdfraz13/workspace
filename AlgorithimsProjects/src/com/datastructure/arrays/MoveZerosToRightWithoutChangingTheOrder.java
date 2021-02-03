package com.datastructure.arrays;

import java.util.Arrays;

public class MoveZerosToRightWithoutChangingTheOrder {

    public static void main(String[] args) {
        int[] a = {10, 0, 1, 0, 5, 9, 0, 8, 8 , 9};
        int l = 0;
        int r = a.length -1;
        while (l < r)
        {
            if (a[l] != 0) {
                l++;
            }else {
                // swap with next element
                swap(a, l, l+1);
                l++;
            }
            System.out.println(Arrays.toString(a));
        }
    }

    static void swap(int[] a , int i , int j)
    {
        if (j < a.length)
        {
            if (a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else {
                j++;
                swap(a, i, j);
            }
        }
    }
}
