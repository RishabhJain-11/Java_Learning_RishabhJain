package com.searching;

public class CeilingaNumber {
        /*
        arr = [2,3,4,5,6,7,8,9,10,11,14,15,16,17,18,19,20,23] -> sorted array
        ceiling = smallest element in array greater or equal to target
        ceiling = arr,target=14 = 14
        ceiling = (arr,target= = 15)=16
        ceiling = (arr,target=4) = 5
        ceiling = (arr,target=9) = 9
        */
        /*
         arr=[2,3,5,9,14,16,18]
         sorted array - please do apply binary search
        */
        /*
        linkedin
        careers page
        relevel
         */



//        int arr = [2,3,4,5,6,7,8,9,10,11,14,15,16,17,18,19,20,23]

//        public class Ceiling {

            public static void main(String[] args) {
                int[] arr = {2, 3, 5, 9, 14, 16, 18};
                int target = 15;
                int ans = ceiling(arr, target);
                System.out.println(ans);
            }

            // return the index of smallest no >= target
            static int ceiling(int[] arr, int target) {

                // but what if the target is greater than the greatest number in the array
                if (target > arr[arr.length - 1]) {
                    return -1;
                }
                int start = 0;
                int end = arr.length - 1;

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

//}
