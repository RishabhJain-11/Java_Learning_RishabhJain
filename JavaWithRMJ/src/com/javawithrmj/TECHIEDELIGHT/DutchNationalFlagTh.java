package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class DutchNationalFlagTh {
    public static void main(String[] args) {
        int[] A = {0,1,2,2,1,0,0,2,0,1,1,0};
        threeWayPartition(A);
        System.out.println(Arrays.toString(A));
    }

    public static void threeWayPartition(int[] A){
        int start = 0,mid = 0;
        int pivot = 1;
        int end = A.length - 1;

        while (mid <= end){
            if (A[mid] < pivot){
                swap(A,start,mid);
                ++start;
                ++mid;
            }

            else if (A[mid] > pivot){
                swap(A,mid,end);
                --end;
            }
            else{
                ++mid;
            }
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
