package com.dsajavarev;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums,int target){
        int right = nums.length-1;
        int left = 0;
        int mid = 0;

        while(left <=  right){
            mid = left + (right - left)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) {left = mid + 1;}
            if(target < nums[mid]) {right = mid - 1;}
        }
        return -1;
    }
}