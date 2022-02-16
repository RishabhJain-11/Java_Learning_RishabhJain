package com.searching;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {12,56,43,-7,65,4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = 0;

        //find minimum element number in the array
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans =arr[i];
            }
//            if(arr[i]>ans){
//                ans=arr[i];
//            }
        }
        return ans;
    }
}
