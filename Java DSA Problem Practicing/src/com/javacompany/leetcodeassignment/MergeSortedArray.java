package com.javacompany.leetcodeassignment;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int n = nums1.length;
        int[] nums2 = {2,5,6};
        int m = nums2.length;
        int[] nums3 = new int[n + m];
        System.out.println(merge(nums1, m, nums2, n));;

//        System.out.println("Array after merging");
//        for (int i=0; i < n+m; i++)
//            System.out.print(nums3[i] + " ");
    }

/*
    public static void mergeSortedArray(int[]nums1,int[] nums2,int m,int n,int[] nums3){
        int i=0,j=0,k = 0;

        while (i<n && j < m){
            if (nums1[i]<nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }
        while (i < n){
            nums3[k++] = nums1[i++];
        }
        while (j < m){
            nums3[k++] = nums2[j++];
        }
    }

*/
public static boolean merge(int[] nums1, int m, int[] nums2, int n) {
    int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
    while (tail1 >= 0 && tail2 >= 0) {
        nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                nums1[tail1--] : nums2[tail2--];
    }

    while (tail2 >= 0) { //only need to combine with remaining nums2
        nums1[finished--] = nums2[tail2--];
    }
    return false;
}
}
