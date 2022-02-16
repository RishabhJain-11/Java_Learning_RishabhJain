package com.mergesortrecursion;

import java.util.Arrays;

public class MErgesortINPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortinPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortinPlace(int[] arr, int s, int e){
        if (arr.length ==  1){
            return;
        }
        int mid = s+(e-s)/2;

        mergeSortinPlace(arr,s,mid);
        mergeSortinPlace(arr,mid,e);

        mergeinPlace(arr,s,mid,e);

    }

    private static void mergeinPlace(int[] arr,int s,int m,int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i< m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        //copy the remaining elelments
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[i];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
