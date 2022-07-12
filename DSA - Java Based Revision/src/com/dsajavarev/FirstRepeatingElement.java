package com.dsajavarev;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr,n));
    }
    public static int firstRepeated(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i = 0;i < n;i++){
            if(map.get(arr[i]) >= 2){
                return i+1;
            }
        }
        return -1;
    }
}
