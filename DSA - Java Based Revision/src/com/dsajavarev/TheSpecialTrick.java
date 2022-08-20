package com.dsajavarev;

import java.util.HashSet;
import java.util.Set;

public class TheSpecialTrick {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

//    public static int findDuplicate(int[] nums ){
//        Set<Integer> seen = new HashSet<Integer>();
//        for(int num : nums){
//            if(seen.contains(num))
//                return num;
//            seen.add(num);
//        }
//        return -1;
//    }
public static int findDuplicate(int[] nums){
    int duplicate = -1;
    for(int i = 0;i < nums.length;i++){
        int cur = Math.abs(nums[i]);
        if(nums[cur] < 0){
            duplicate = cur;
            break;
        }
        nums[cur] *= -1;
    }

    for(int i = 0;i < nums.length;i++)
        nums[i] = Math.abs(nums[i]);

    return duplicate;
}
}
