package com.recursion;

public class SortedCheckingByRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
        int n = arr.length;
        if (sort(arr,n)!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static int sort(int[] arr,int n){
        if(n==0||n==1)
            return 1;
        if (arr[n-1] < arr[n-2])
            return 0;
        return sort(arr,n-1);
    }
}
