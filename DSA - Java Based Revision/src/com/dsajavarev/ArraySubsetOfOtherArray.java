package com.dsajavarev;

import java.util.HashSet;

public class ArraySubsetOfOtherArray {
    public static void main(String[] args) {
        int[] a1 = {11, 1, 13, 21, 3, 7};
        int[] a2 = {11, 3, 7, 1};
//        System.out.println(isSubset(a1,a2));
    }
    public static String isSubset(long[] a1, long[] a2, long n, long m) {
        HashSet<Long> set = new HashSet<>();
        for(Long g : a1){
            set.add(g);
        }
        for(long g : a2){
            if(!set.contains(g))
                return "No";
        }
        return "Yes";
    }
}
