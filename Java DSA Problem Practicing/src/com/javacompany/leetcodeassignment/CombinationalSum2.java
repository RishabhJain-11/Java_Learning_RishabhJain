package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum2 {
    public static void main(String[] args) {

    }
    private void findComb(int ind, int[] arr, int target, List<List<Integer>>ans,List<Integer> ds){
        if (ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findComb(ind,arr,target-arr[ind],ans,ds);
        }
        findComb(ind+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combSum(int[] candidate,int target){
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0,candidate,target,ans,new ArrayList<>());
        return ans;
    }
}
