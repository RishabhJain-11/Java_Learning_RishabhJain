package com.arrays;

import java.util.Arrays;

public class Passing_in_Functions {
    public static void main(String[] args) {
       int[] nums  = {1,2,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    //string are mutable
    // arrays are immutable
    public static void change(int[] arr){
        arr[0] = 99;
    }
}
