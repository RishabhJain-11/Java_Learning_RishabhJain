package com.recursion1;

public class RecursionCheckForArraySorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,6,7,9,8};
        int n = arr.length;
        if(sort(arr,n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean sort(int[]arr,int n){
        if(n==0||n==1){
            return true;
        }
        return sort(arr,n-1) && arr[n-1]>=arr[n-2];

    }

}
