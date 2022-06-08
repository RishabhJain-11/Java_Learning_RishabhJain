package com.dsajavarev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllSubarraysWithSumZero {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        sumZeroArray(nums);
    }
    private static <K,V> void insert(Map<K, List<V>> hashMap,K key,V value){
        hashMap.putIfAbsent(key,new ArrayList<>());
        hashMap.get(key).add(value);
    }
    public static void sumZeroArray(int[] nums){
        Map<Integer,List<Integer>> hashMap = new HashMap<>();
        insert(hashMap,0,-1);

        int sum = 0;

        for(int i = 0;i < nums.length;i++){
            sum += nums[i];

            if(hashMap.containsKey(sum)){
                List<Integer> list = hashMap.get(sum);

                for (Integer value : list){
                    System.out.println("Subarray [" + (value + 1) + "…" +
                            i + "]");
                }
            }
            insert(hashMap,sum,i);
        }
    }
}


/*
//        for (int i = 0;i < nums.length;i++){
//            int sum = 0;
//            for (int j = i;j < nums.length;j++){
//                sum += nums[j];
//
//                if(sum == 0){
//                    System.out.println("Subarray [ " + i + "..." + j + " ]");
//                }
//            }
//        }
 */