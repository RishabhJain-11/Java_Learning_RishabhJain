package com.searching;

public class ArrayofInfinitelenght {
    public static void main(String[] args) {
        //start with the box 2
        int[] arr= {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(findingRange(arr,target));
    }

    static int findingRange(int[] arr, int target){
        //find the range
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end+1;
            //double the box value
            //end = previous end + sizeofbox*2;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start,int end) {

        // but what if the target is greater than the greatest number in the array
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
