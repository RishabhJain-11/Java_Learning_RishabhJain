package com.dsajavarev;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSumZeroExitsOrNot {
    public static void main(String[] args) {
        int[] nums = { 4, -6, 3, -1, 4, 2, 7 };

        if (hasZeroSumSubarray(nums)){
            System.out.println("Subarray exists");
        }else {
            System.out.println("Subarray does not exists");
        }
    }
    public static boolean hasZeroSumSubarray(int[] nums){
        Set<Integer> set = new HashSet<>();
        set.add(0);

        int sum = 0;

        for (int value : nums){
            sum += value;

            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
