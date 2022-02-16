package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class SegregstePosNegInt {
    public static void main(String[] args) {
        int [] nums = { 9,-3,5,-2,-8,-6,1,3};
        segregate(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void segregate(int[] a){
        int pIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0){
                swap(a,i,pIndex);
                pIndex++;
            }
        }
    }

    private static void swap(int[] a,int i , int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
//The time complexity of the above solution is O(n) and doesn’t require any extra space, where n is the size of the input.
}
