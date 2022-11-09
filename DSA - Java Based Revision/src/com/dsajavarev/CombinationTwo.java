package com.dsajavarev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationTwo {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        // Answer ke liye list bana liya hai
        List<List<Integer>> ans = new ArrayList<>();
        // sorting
        Arrays.sort(candidates);
        // calling of the function
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        // returning the answer
        return ans;
    }

    public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        // if target is zero then return nothing
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        // the ind is from the findCombinations call
        for(int i = ind;i < arr.length;i++){

            if(i > ind && arr[i] == arr[i - 1])
                continue;

            if(arr[i] > target)
                break;

            ds.add(arr[i]);
            findCombinations(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
