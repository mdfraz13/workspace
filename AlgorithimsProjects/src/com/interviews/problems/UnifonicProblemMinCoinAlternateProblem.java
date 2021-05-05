package com.interviews.problems;

/**
 *  Minimum Steps to make array alternate with number.
 */
public class UnifonicProblemMinCoinAlternateProblem {

    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 0, 0};
        int value =  Math.min(getMinStepsStartWith(a, 0), getMinStepsStartWith(a, 1));
        System.out.println(value);
    }

    public static int getMinStepsStartWith(int[] a, int expected)
    {
        int flipCount = 0;
        for (int j : a)
        {
            if (j != expected)
            {
                expected = flip(j);
                flipCount++;
            }
        }
        return flipCount;
    }

    private static int flip(int i) {
        return i == 0 ? 1 : 0;
    }


}
