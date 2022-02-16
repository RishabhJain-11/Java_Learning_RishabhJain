package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectTwoArrays2 {
    public static void main(String[] args) {

        int[] nums1 = {4,5,9};
        int[] nums2 = {4,5,9,5,4,9,2,6};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;

        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            int a = nums1[i], b = nums2[j];
            if (a == b) {
                list.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }

        int[] ret = new int[list.size()];
        for (int k = 0; k < list.size(); k++)
            ret[k] = list.get(k);
            return ret;
    }
}
