package com.dsajavarev;

import java.util.ArrayList;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int N = 4;
//        int a[] = {0,3,1,2};
        int a[] = {2,3,1,2,3};
        System.out.println(duplicates(a,N));
    }
    public static ArrayList<Integer> duplicates(int[] arr,int n){
        for(int i = 0;i < n;i++){
            int index = arr[i] % n;
            arr[index] += n;
        }
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0;i < n;i++){
            if((arr[i]/n) > 1){
                ans.add(i);
                flag = 1;
            }
        }
        if(flag == 0)
            ans.add(-1);
        return ans;
    }
}
