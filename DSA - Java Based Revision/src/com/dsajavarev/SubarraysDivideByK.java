package com.dsajavarev;

public class SubarraysDivideByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
    public static int subarraysDivByK(int[] nums, int k){
        int n = nums.length;
        int prefixMod = 0, res = 0;

        int[] modGroups = new int[k];
        modGroups[0] = 1;

        for(int num : nums){
            prefixMod = (prefixMod + num % k + k) % k;
            res += modGroups[prefixMod];
            modGroups[prefixMod]++;
        }
        return res;
    }
}
