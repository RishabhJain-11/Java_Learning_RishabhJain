package com.javacompany.leetcodeassignment;

import java.util.Arrays;
import java.util.Comparator;

public class SortbyBits {
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] arr1 = {2,3,5,7,11,13,17,19};
        System.out.println(Arrays.toString(sortByBits(arr1)));
    }

    static int[] sortByBits(int [] arr){
        Integer[] a= new Integer[arr.length];
        for (int i = 0; i < a.length; i++)
            a[i] = arr[i];

        Arrays.sort(a, Comparator.comparing(i->Integer.bitCount(i)*10000+i));

        for (int i = 0; i < a.length; i++)
            arr[i] = a[i];

        return arr;
    }
}
