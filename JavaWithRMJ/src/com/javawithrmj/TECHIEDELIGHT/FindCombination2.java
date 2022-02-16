package com.javawithrmj.TECHIEDELIGHT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCombination2 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        int k = 2;
        System.out.println(findCombinations(A, k));
    }

    public static void findCombinations(int[] A, int i, int k, Set<List<Integer>> subarrays,List<Integer> out){
        if(A.length == 0){
            return;
        }
        if(k == 0){
            subarrays.add(new ArrayList<>(out));
            return;
        }
        if(i == A.length){
            return;
        }
        out.add(A[i]);
        findCombinations(A,i+1,k-1,subarrays,out);

        out.remove(out.size() - 1);
        findCombinations(A,i+1,k,subarrays,out);
    }
public static Set<List<Integer>> findCombinations(int[] A,int k){
        Set<List<Integer>> subarrays = new HashSet<>();
        findCombinations(A,0,k,subarrays,new ArrayList<>());
        return subarrays;
}
}
