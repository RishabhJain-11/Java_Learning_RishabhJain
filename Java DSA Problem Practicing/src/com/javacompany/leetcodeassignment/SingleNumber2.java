package com.javacompany.leetcodeassignment;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums){
        int ans = 0 ;//initially the ans is zero
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if(((nums[j] >> i)&1)==1){
                    sum++;
                    sum %= 3;
                }
            }
            if(sum != 0){
                ans |= sum << i;
            }
        }
        return ans;
    }
}
