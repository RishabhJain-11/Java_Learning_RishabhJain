package com.javawithrmj.TECHIEDELIGHT;

public class FindPairMaxAbsSum {
    public static void main(String[] args) {
        int[] nums = {-6,-5,-3,0,2,4,9};
        findPair(nums);
    }

    static void findPair(int[] nums){
        if (nums.length < 2){
            return;
        }

        int low = 0;
        int hi = nums.length - 1;

        int min = Integer.MAX_VALUE;
        int i = 0 , j = 0;

        while (low < hi) {
            if ((Math.abs(nums[low]+ nums[hi])) < min){
                min = (Math.abs(nums[low]+ nums[hi]));

                i = low;
                j = hi;
            }

            if (min == 0){
                break;
            }

            if (nums[low] + nums[hi] < 0){
                low ++;
            }else{
                hi--;
            }
        }
        System.out.println("Pair found are " + nums[i] + " and "+ nums[j]);
    }
}
