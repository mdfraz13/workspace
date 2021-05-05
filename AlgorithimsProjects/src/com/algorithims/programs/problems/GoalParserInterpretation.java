package com.algorithims.programs.problems;

import java.util.Stack;

public class GoalParserInterpretation {

    public static void main(String[] args) {
        final var input = "G()(al)";
        char[] ch = input.toCharArray();
        StringBuffer result = new StringBuffer();
        method1(input, ch, result);
        System.out.println(result.toString());
    }

    private static void method1(String input, char[] ch, StringBuffer result) {
        for (int i = 0; i < input.length();) {
            if (ch[i] == 'G') {
                result.append("G");
                i++;
            }
            else if (ch[i] == '(' && ch[i+1] == ')') {
                result.append("o");
                i = i + 1;
            }
            else if (ch[i] == '(' && ch[i+1] == 'a' && ch[i+2] == 'l' && ch[i+3] == ')') {
                result.append("al");
                i = i + 4;
            }
            else {
                i++;
            }
        }
    }

    private static void method2(String input, char[] ch, StringBuffer result) {
        for (int i = 0; i < input.length();) {
            if (ch[i] == 'G') {
                result.append("G");
                i++;
            }
            else if (ch[i] == '(' && ch[i+1] == ')') {
                result.append("o");
                i = i + 1;
            }
            else if (ch[i] == '(' && ch[i+1] == 'a' && ch[i+2] == 'l' && ch[i+3] == ')') {
                result.append("al");
                i = i + 4;
            }
            else {
                i++;
            }
        }
    }
}
