package com.interviews.problems;

import java.util.Arrays;

public class RotationOfString {

    public static void main(String[] args) {
        final var str1 = "abcd"; // d --> a b
        final var str2 = "dabc";
        int length = str1.length();
        char[] strAr = str1.toCharArray();
        for (int i = 0 ; i < length ; i++) {
            rotateCharArrayBy1(strAr, length);
            System.out.println(Arrays.toString(strAr));
        }
    }

    private static void rotateCharArrayBy1(char[] ch, int length)
    {
        char characterAtLastIndex = ch[length -1];
        int i = length - 1;
        while (i >= 1) {
            ch[i] = ch[i - 1];
            i--;
        }
        ch[0] = characterAtLastIndex;
    }
}
