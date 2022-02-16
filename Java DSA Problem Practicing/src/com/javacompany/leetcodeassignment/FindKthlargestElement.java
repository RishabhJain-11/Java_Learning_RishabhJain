package com.javacompany.leetcodeassignment;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthlargestElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 2;
        System.out.println(findKthLargestElemnt(nums,k));
    }

    static int findKthLargestElemnt(int[] nums,int k){
//        final int N = nums.length;
//        Arrays.sort(nums);
//        return nums[N-k];


        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums){
            pq.offer(val);

            if (pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
