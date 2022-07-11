package com.dsajavarev;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {7 ,10 ,4 ,3 ,20 ,15};
        int K = 3;
        int l = 0;
        int r = arr.length;
        System.out.println(kthSmallest(arr,l,r,K));
    }
//    public static int kthSmallest(int[] arr, int l, int r, int k)
//    {
//        //Your code here
////        Arrays.sort(arr);
////        return arr[k-1];
//
//
//
//
//    }

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        int partition = partition(arr,l,r);
        if(partition == k-1)
            return arr[partition];
        else if(partition < k - 1)
            return kthSmallest(arr,partition+1,r,k);
        else
            return kthSmallest(arr,l,partition-1,k);

    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high], pivotloc = low;
        for(int i=low;i<=high;i++){
            if(arr[i] < pivot){
                int temp = arr[i];
                arr[i] = arr[pivotloc];
                arr[pivotloc] = temp;
                pivotloc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotloc];
        arr[pivotloc] = temp;

        return pivotloc;
    }
}
