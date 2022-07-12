package com.dsajavarev;

import java.util.HashMap;

public class SubarraysWithEqualOnesAndZeros {
    public static void main(String[] args) {
        int n = 7;
        int A[] = {1,0,0,1,0,1,1};
        System.out.println(countSubarrWithEqualZeroAndOne(A,n));
    }
    public static int countSubarrWithEqualZeroAndOne(int arr[], int n){
        int ans = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;

        for (int val : arr){
            if(val == 0){
                sum += -1;
            }else {
                sum += 1;
            }
            if(map.containsKey(sum)){
                ans += map.get(sum);
                map.put(sum,map.get(sum) + 1);
            }else {
                map.put(sum,1);
            }
        }
        return ans;
    }
}
