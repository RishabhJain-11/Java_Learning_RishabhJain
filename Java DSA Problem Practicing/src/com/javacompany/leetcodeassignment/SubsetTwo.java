package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetTwo {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    static List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),nums,0);//this is the calling of the helper function
        return res;//then return the resultant table
    }

    static void helper(List<List<Integer>> res, ArrayList<Integer> ls, int[] nums, int pos) {
        res.add(new ArrayList<>(ls));
        for (int i = pos; i < nums.length; i++) {
            if(i>pos && nums[i]==nums[i-1]) continue;//just ignoring the repeated elements
            ls.add(nums[i]);//adding all the remaining elements
            helper(res,ls,nums,i+1);//calling of the recursive function
            ls.remove(ls.size()-1);//also removing the function and then adding and then again repeating the backtracking call
        }
    }

}
