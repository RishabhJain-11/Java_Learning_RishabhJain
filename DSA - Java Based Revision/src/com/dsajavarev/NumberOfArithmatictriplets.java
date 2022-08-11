package com.dsajavarev;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmatictriplets {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num - diff) && seen.contains(num - diff * 2)){
                ++cnt;
            }
            seen.add(num);
        }
        return cnt;
    }
}
