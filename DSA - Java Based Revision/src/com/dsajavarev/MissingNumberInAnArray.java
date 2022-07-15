package com.dsajavarev;

import java.util.Arrays;

public class MissingNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        System.out.println(MissingNumber(arr,n));
    }
    public static int MissingNumber(int[] arr, int n){
        Arrays.sort(arr); // we have sorted the array
        for(int i = 1;i < n;i++){
            if(arr[i-1] != i){
                return i;
            }
        }
        return n;
    }
}
