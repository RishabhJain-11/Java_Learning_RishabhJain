package com.dsajavarev;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {4 ,2 ,-3, 1 ,6};
        int n = 5;
        System.out.println(findsum(arr,n));
    }
    static boolean findsum(int[] arr, int n)
    {
        //Your code here
        HashSet<Integer> hs = new HashSet<>();//created a hashset
        int sum = 0;//initially sum = 0
        hs.add(0);//added initially the 0.

        for(int i = 0;i < n;i++){
            sum += arr[i];//adding the element in a set by iterating the loop and checking it again and again.
            if(hs.contains(sum)) return true;//if the added number is equal to what we have to get

            hs.add(sum);//change the sum  to that and return true;
        }
        return false;// else return false
    }
}
