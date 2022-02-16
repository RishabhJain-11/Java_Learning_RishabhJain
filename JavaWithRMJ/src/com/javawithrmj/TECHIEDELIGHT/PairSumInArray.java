package com.javawithrmj.TECHIEDELIGHT;
//https://www.techiedelight.com/find-pair-with-given-sum-array/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Find a pair with the given sum in an array
public class PairSumInArray {
    public static void main(String[] args) {

//        int [] nums = {8,7,2,5,3,1};
        int [] nums = {5, 2, 6, 8, 1, 9};
        int target = 10;
        findSumHash(nums,target);
//        System.out.println(findSum(nums,target));
//        findSumSort(nums,target);
    }
/*
 Using the Brute force method
    public static boolean findSum(int[] nums,int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println("Pair found = ( "+nums[i] +" , " +nums[j]+" )" );
                    return true;
                }
            }
        }
                System.out.println("Pair not found !");
        return false;
    }
     The time complexity of the above solution is O(n2) and doesn't require any extra space, where n is the size of the input.
*//*
 Using Sorting
 Approach :- The idea is to sort the given array in ascending order and maintain search space by maintaining two indices (low and high) that initially points to two endpoints of the array.
             Then reduce the search space nums[low…high] at each iteration of the loop by comparing the sum of elements present at indices low and high with the desired sum.
             Increment low if the sum is less than the expected sum; otherwise, decrement high if the sum is more than the desired sum. If the pair is found, return it.

    static void findSumSort(int[] nums,int target){
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length-1;

        while (low < high){
            if(nums[low] + nums[high] == target){
                System.out.println("Pair found = ( "+nums[low] +" , " +nums[high]+" )" );
                return;
            }
        if (nums[low] + nums[high] < target){
            low ++;
        }else {
            high--;
        }
        }
        System.out.println("Pair not found !");
    }
The time complexity of the above solution is O(n.log(n)) and doesn’t require any extra space
*/
//Using Hashing
    static void findSumHash(int[]nums,int target){


        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < nums.length; i++)
        {
            // check if pair (nums[i], target-nums[i]) exists

            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i]))
            {
                System.out.printf("Pair found (%d, %d)",
                        nums[map.get(target - nums[i])], nums[i]);
                return;
            }

            // store index of the current element in the map
            map.put(nums[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
    //The time complexity of the above solution is O(n) and requires O(n) extra space, where n is the size of the input.
}
