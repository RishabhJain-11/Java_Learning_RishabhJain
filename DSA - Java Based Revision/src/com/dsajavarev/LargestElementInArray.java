package com.dsajavarev;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        int n = 5;
        System.out.println(largest(arr,n));
    }
    public static int largest(int[] arr, int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=i+1; j<n; j++){
                int tmp = 0;
                if (arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr[n-1];
    }
}
