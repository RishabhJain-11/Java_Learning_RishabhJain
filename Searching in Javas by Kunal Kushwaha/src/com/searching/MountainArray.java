package com.searching;

public class MountainArray {
    //known as a biotonic array
    //first increasing and then decreasing
    public static void main(String[] args) {

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
}
