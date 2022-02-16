package com.searching;

public class BinarySearch {
    //Binary Search
    //imagine the array is sorted
    public static void main(String[] args) {
        /*
        step 1:find the middle element in the array
        step 2:check if the target element >mid element (search in the right) or (search in the left)
        step 3:if middle element == target element = ans
        tip : if start > end --> error
        best case : if middle element == searching number , best case O(1) , as the size increases the time remain constant
        worst case : total comparison in worst case : O(log N)


        */
        int [] arr = {2,4,5,6,7,8,9,34,45,56,768};
        int target = 356;
        int ans = binsearch(arr,target);
        System.out.println(ans);

    }

    static int binsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//            int mid = (start + end) / 2 ;//it will give error in case of large start and end.
            int mid = start+ ((end-start)/2);

            if(target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
