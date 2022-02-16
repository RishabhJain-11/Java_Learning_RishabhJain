package com.searching;
//Leetcode Medium Q on arrays and binary search
public class ShipingWithinDDays {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        System.out.println(shipWithinDays(arr,D));
    }

    public static int shipWithinDays(int[] weights, int D) {
        int left = 0, right = 0;
        for (int w: weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, need = 1, cur = 0;
            for (int w: weights) {
                if (cur + w > mid) {
                    need += 1;
                    cur = 0;
                }
                cur += w;
            }
            if (need > D) left = mid + 1;
            else right = mid;
        }
        return left;
    }

}
