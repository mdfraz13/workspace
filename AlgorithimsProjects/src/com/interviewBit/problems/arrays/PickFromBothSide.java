package com.interviewBit.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickFromBothSide {

    public static void main(String[] args) {
        int[] input = {5, -2, 3, 1, 2};
        // prefix == {5, 3, 6, 7, 9}
        // suffix == {2, 3, 6, 4, 9}
        int B = 3;
        //int[] input = {-55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587, 314, 503, 448, 200, 458, -382, -420, 796, -202, 281, 589, -202, -991, 157, -528, 622, -462, -708, -962, -821, -810, 657, 958, -809, 815, -112, 156, 511, -798, -366, -728, -945, -672, -354, -638, -114, -125, -567, 869, -858, 844, 416, 881, 998, -678, -349, -979, 699, 557, -524, 892, -611, 75, -288, -400, -490, 3, -131, 861, -312, 401, 789, 255, -577, 2, -415, -818, -715, 88, 426, -383, 757, 832, -68, -831, -846, 721, 189, 976, 329, -632, -308, 425, -445, 434, -451, 441, 512, -855, -940, 718, 753, -861, -577, -721, 996, -313, -471, -451, 437, 866, -51, -807, 195, 297, -584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333, 285, -450, -860, 694, -305, 624, -981, -875, -424, 694, -342, -698, 371, -534, -322, -407, 851, 484, 18, -536, 119, 152, -200, -913, 60, 926, 10, -243, -830, -685, 576, -773, -957, -242, 164, 109, 882, 86, 565, 487, 577, -526, -375, 627, 629, 928, 423, -480, -98, -38, -877, -404, 737, 261, -805, -475, 264, -740, -798, -884, 30, -674, 11, -229, -589, 547, 153, 520, 790, -76, -812, 763, -60, -149, -338, 829, -100, 713, -42, 578, -635, 7, 477, 200, -942, -561, -697, -240, 357, -676, -523, 108, 113, -113, 801, -150, -540, -572, -7, 384, 405, -460, 111, -296, -165, -644, -928, 350, -177, -515, -444, 216, 626, 357, -474, 357, 337, 271, 869, 361, -104, 22, 617, -888, -283, -304, 585, -959, -577, -871, -771, -435, -441, -68, -704, 855, -947, -38, 584, 734, -346, -28, 457, -631, -468, -37, -393, -517, -89, 635, -933, -152, -325, -62, -777, -858, 754, -489, -259, -825, 459, 825, 221, 870, 626, 934, 205, 783, 850, 398, -721, -299, -807, -266, 637, -466, 556, 993, -824, 705, -38, -452, 881};
        //int B = 301;
        System.out.println(getMax(input, B));
        //System.out.println(getSolution(input, B));
    }

    private static int getMax(int[] input, int size)
    {
        final var length = input.length;
        int[] prefixSum = new int[length+1];
        prefixSum[0] = input[0];
        for (int i = 1; i < length; i++) {
            prefixSum[i] = input[i] + prefixSum[i - 1];
        }
        System.out.println(Arrays.toString(prefixSum));

        int[] suffixSum = new int[length+1];

        suffixSum[0] = input[input.length -1];
        for (int i = 1; i < length; i++) {
            suffixSum[i] = input[length - i -1] + suffixSum[i-1];
        }
        System.out.println(Arrays.toString(suffixSum));

        int maxSum = Integer.MIN_VALUE;
        for (int i = 1 ; i < size; i++)
        {
            int currSum = 0;
                System.out.println(prefixSum[i-1] + " == " + (i-1));
                currSum += prefixSum[i-1];

            if (size-i-1 >= 0) {
                System.out.println(suffixSum[size - i - 1] + " -- " + (size - i - 1));
                currSum += suffixSum[size - i - 1];
            }
            System.out.println(currSum);
           maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);

        return maxSum;
    }

    public static int getSolution(int[] a, int B)
    {
        List<Integer> A = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());

        return solve(A, B);
    }

    public static int solve(List<Integer> A, int B) {
        int n = A.size();
        int[] prefixSum = new int[n];
        for (int i = 0; i < A.size(); i++) {
            prefixSum[i] = i == 0 ? A.get(i) : A.get(i) + prefixSum[i - 1];
        }
        int[] suffixSum = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = i == n - 1 ? A.get(i) : A.get(i) + suffixSum[i + 1];
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(suffixSum));
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= B; i++) {
            int currSum = 0;
            if (B - i > 0) {
                currSum += suffixSum[n - (B - i)];
                System.out.println("suffix == " + (n - (B - i)) + " -- "+suffixSum[n - (B - i)]);
            }
            if(i > 0){
                currSum += prefixSum[i - 1];
                System.out.println("prefix == " + (i-1) + " -- " + prefixSum[i - 1]);
            }
            System.out.println(currSum + " -- ");
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

}
