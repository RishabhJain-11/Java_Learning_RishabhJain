package com.searching;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {12,56,43,7,65,4};
        int target = 43;
        System.out.println(linSearch(arr,target,1,4));
    }

    static int linSearch(int[] arr, int target,int start , int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        int index = start;
        while (index < end) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
            index++;
        }

        //this line will execute if none of the above statement is found to be true
        return -1;
    }


}
