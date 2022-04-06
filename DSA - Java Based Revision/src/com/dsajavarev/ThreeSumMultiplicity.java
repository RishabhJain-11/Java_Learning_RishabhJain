package com.dsajavarev;

import java.util.HashMap;
import java.util.Map;

public class ThreeSumMultiplicity {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int target = 8;
    }
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();//created a map for storing and tracking the elements

        int res = 0;// initially the resultant will be 0 (the output is going to be the res)
        int mod = 1000000007;
        for(int i = 0;i < arr.length;i++){
            res = (res + map.getOrDefault(target - arr[i] ,0)) % mod;

            for(int j = 0;j < i;j++){
                int temp = arr[i] + arr[j];
                map.put(temp,map.getOrDefault(temp,0) + 1);
            }
        }
        return res;
    }
}
