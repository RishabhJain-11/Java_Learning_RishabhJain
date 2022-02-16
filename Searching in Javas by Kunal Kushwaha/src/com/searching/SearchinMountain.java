package com.searching;

public class SearchinMountain {
    public static void main(String[] args) {

    }
    int search(int[] arr,int target){
        //find peak element-- 4th index
        //search in ascending array--[0.4]
        //if not found binary search in descending array--[4,6]
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry!= -1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }
    public int peakIndexMountainArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                //look at left

                end = mid;

            }
            else{
                //you are in ascending part of an array
                start = mid + 1;

            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target,int start,int end) {
        start = 0;
        end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


}
