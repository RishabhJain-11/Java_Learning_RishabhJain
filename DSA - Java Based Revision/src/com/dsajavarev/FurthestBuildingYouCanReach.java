package com.dsajavarev;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int []heights = {4,2,7,6,9,14,12};
        int bricks = 5, ladders = 1;
        System.out.println(buildingReach(heights,ladders,bricks));
    }
    public static  int buildingReach(int[] A,int ladders,int bricks){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0;i < A.length - 1;i++){
            int d = A[i+1] - A[i];
            if(d > 0)
                pq.add(d);
            if(pq.size() > ladders)
                bricks -= pq.poll();
            if(bricks < 0)
                return i;
        }
        return A.length - 1;
    }
}
