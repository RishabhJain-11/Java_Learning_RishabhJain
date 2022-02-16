package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairsWithKDifference {
    public static void main(String[] args) {
        int[]nums = {1,5,2,2,2,5,5,4};
        int diff = 3;

//        arrDiff(nums,diff);
        findDiff(nums,diff);
    }

    //Use of Set
//The time complexity of the above solution is O(n) and requires O(n) extra space. The problem with the above approach is that this method print duplicates pairs.
    static void arrDiff(int[] a,int diff){
        Set<Integer> set = new HashSet<>();
        for (int i : a){
            if (set.contains(i - diff)){
                System.out.println("(" + i + ", " + (i - diff) + ")");
            }
            if (set.contains(i + diff)){
                System.out.println("(" + (i + diff) + ", " + i + ")");
            }

            set.add(i);
        }
    }

    //After removing the duplicates
    // Can be Done by sorting
    static void findDiff(int[]a,int diff){
        Arrays.sort(a);
//        The time complexity of the above solution is O(n.log(n)) and requires O(n) extra space, where n is the size of the input.
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            while(i+1 < a.length && a[i] == a[i+1]){
                i++;
            }
            if (set.contains(a[i] - diff)){
                System.out.println("(" + a[i] + ", " + (a[i] - diff) + ")");
            }
            if (set.contains(a[i] + diff)){
                System.out.println("(" + (a[i] + diff) + ", " + a[i] + ")");
            }
            set.add(a[i]);
        }
    }
}
