package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        int[] num = {1,2,3};
//        System.out.println(subsets(num));
    }

/*
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<Integer>());

        for (int num:
             nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> curr:
                 output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets){
                output.add(curr);
            }
        }
        return output;
    }
*/
}
