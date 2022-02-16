package com.javacompany.leetcodeassignment;

public class SortColors {
    public static void main(String[] args) {

    }
    static void sortColors(int [] nums){
        int lo = 0, hi = nums.length-1,mid = 0;
        int temp ;

        while (mid <= hi){
            switch (nums[mid]){
                case 0:{
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
            }
        }
    }
}
