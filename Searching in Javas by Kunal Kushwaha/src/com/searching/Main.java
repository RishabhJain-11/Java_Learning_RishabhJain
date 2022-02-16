package com.searching;

import java.lang.module.FindException;

public class Main {

    public static void main(String[] args) {

        //linear search
        //Q find whether 14 exits in the array or not : can access by index  or by for each loop.
        //linear search : start searching from the first element till you reach that element
        //time comp : best complexity of linear search - O(1) :best   worst case - O(n)
        // worst case - you do not  find the item i was looking for
        //O(n) -- upper bound
        //time complexity - your time grows as your input grows
        //space complexity -- are you taking more extra space
        // try to search in the array -- return the index if item found
        int nums[] ={1,3,53,13,65,3424};
        int target = 65;
        int ans = linSearch(nums,target);
        System.out.println(ans);
    }
/*
    static int linSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will execute if none of the above statement is found to be true
        return -1;
    }*/



    //return the element
static int linSearch(int[] arr, int target) {
    if (arr.length == 0) {
        return -1;
    }
    // run a for loop
    for (int element : arr) {
        if (element == target) {
            return element;
        }
    }

    //this line will execute if none of the above statement is found to be true
    return -1;
}



}
