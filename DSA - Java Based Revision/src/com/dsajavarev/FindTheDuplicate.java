package com.dsajavarev;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        boolean[] b = new boolean[nums.length];//this will take all the values as false

        for (int num : nums) {
            if (b[num]) {// then all the numbers will be compared
                return num;//index number will be returned
            }
            b[num] = true; // then assign that index number as true
        }
        return -1;
    }
}
/*
     int duplicate = -1;

         for(int i : nums){
             int val = (i < 0) ? -i : i;

             if(nums[val] >= 0){
                 nums[val] = -nums[val];
             }
             else{
                 duplicate = val;
                 break;
             }
         }
         for(int i = 0;i < nums.length;i++){
             if(nums[i] < 0){
                 nums[i] = -nums[i];
             }
         }
         return duplicate;
 */