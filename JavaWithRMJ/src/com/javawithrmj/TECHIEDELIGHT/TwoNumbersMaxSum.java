package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;
import java.util.Comparator;

public class TwoNumbersMaxSum {
    public static void main(String[] args) {
        Integer [] input = { 4, 6, 2, 7, 9, 8 };
        findMax(input);
    }

    static void findMax(Integer[] inp){
        if (inp.length < 1){
            return;
        }
        Arrays.sort(inp, Comparator.reverseOrder());

        int x = 0;
        for (int i = 0; i < inp.length; i = i + 2) {
            x = x * 10 + inp[i];
        }

        int y = 0;
        for (int i = 1; i < inp.length; i = i + 2) {
            y = y * 10 + inp[i];
        }

        System.out.println("The two numbers with maximum sum are " + x + " and " + y);
    }
}
