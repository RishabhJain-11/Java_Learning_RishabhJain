package com.dsajavarev;

import java.util.HashMap;
import java.util.Map;

public class CountNKOccurences {
    public static void main(String[] args) {
        int N = 8;
        int[] arr = {3,1,2,2,1,2,3,3};
        int k = 4;
        System.out.println(countOccurence(arr,N,k));
    }
    public static int countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer
        int b = n/k;
        HashMap<Integer,Integer> map = new HashMap<>();

        int c = 0;
        for(int i = 0;i < n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > b){
                c++;
            }
        }
        return c;
    }
}
