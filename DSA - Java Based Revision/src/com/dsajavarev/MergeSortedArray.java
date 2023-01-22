package com.dsajavarev;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    public static String[] merge(int[] nums1, int m, int[] nums2, int n){
//        IntStream.range(0, n).forEach(i -> nums1[i + m] = nums2[i]);
//        Arrays.sort(nums1);

        int i = m-1;
        int j = n-1;
        for(int k = m+n-1;k >= 0;k--){
            if(i >= 0 && (j == -1 || nums1[i] > nums2[j])){
                nums1[k] = nums1[i--];
            }else if(j >= 0){
                nums1[k] = nums2[j--];
            }
        }
        return new String[]{};
    }
}
