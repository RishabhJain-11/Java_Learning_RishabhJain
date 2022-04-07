package com.dsajavarev;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int a : stones)
            pq.offer(a);
        while(pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }
}
