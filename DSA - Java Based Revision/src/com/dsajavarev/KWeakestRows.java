package com.dsajavarev;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

public class KWeakestRows {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRow(mat, k)));
        
    }

    public static int[] kWeakestRow(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int[] ans = new int[k];


        for(int i = 0;i < mat.length;i++){
            pq.offer(new int[] {numOnes(mat[i]), i});

            if(pq.size() > k)
                pq.poll();
        }

        while(k > 0)
            ans[--k] = Objects.requireNonNull(pq.poll())[1];

        return ans;
    }


    private static int numOnes(int[] row){
        int lo = 0;
        int hi = row.length;


        while(lo < hi){
            int mid = lo + (hi - lo) / 2;

            if(row[mid] == 1)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }

}
