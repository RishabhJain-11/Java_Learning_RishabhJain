package com.dsajavarev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {

    }
    public static List<Integer> addToArrayForm(int[] A, int K){
        int N = A.length;
        int curr = K;
        List<Integer> ans = new ArrayList<>();

        int i = N;
        while(--i >= 0 || curr > 0){
            if(i >= 0)
                curr += A[i];

            ans.add(curr % 10);
            curr /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
