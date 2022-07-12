package com.dsajavarev;

import java.util.HashMap;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        int n = arr.length;
        System.out.println(firstNonRepeating(arr,n));
    }
    public static int firstNonRepeating(int[] arr, int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;
    }
}
