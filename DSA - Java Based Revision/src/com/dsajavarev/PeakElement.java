package com.dsajavarev;

public class PeakElement {
    public static void main(String[] args) {
        int N = 3;
        int arr[] = {1,2,3};
        System.out.println(peakElement(arr,N));
    }
    public static int peakElement(int[] arr,int n)
    {
        int max = arr[0];
        int index = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
            i++;
        }
        return index;
    }
}
