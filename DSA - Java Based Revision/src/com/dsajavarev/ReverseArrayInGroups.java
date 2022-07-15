package com.dsajavarev;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        int N = 5, K = 3;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(reverseInGroups(arr,N,K));
    }
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i = 0;i < n;i+=k){
            int left = i;
            int right = Math.min(i+k-1,n-1);

            while(left < right){
                Collections.swap(arr,right,left);
                left++;
                right--;
            }
        }
        return new ArrayList<>(arr);
    }
}
