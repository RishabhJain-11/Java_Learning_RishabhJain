package com.dsajavarev;

import java.util.PriorityQueue;

public class ConstructTargetArrayWithMultipleSums {
    public static void main(String[] args) {
        int[] target = {3,9,5};
        System.out.println(isPossible(target));
    }
    public static boolean isPossible(int []A){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));
        long total = 0;
        for (int a : A){
            total += a;
            pq.add(a);
        }
        while (true){
            int a = pq.poll();
            total -= a;
            if(a == 1 || total == 1)
                return true;
            if(a < total || total == 0 || a % total == 0)
                return false;

            a %= total;
            total += a;
            pq.add(a);
        }
    }
}


/*
public boolean isPossible(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (b - a));
        long total = 0;
        for(int a : A){
            total += a;
            pq.add(a);
        }
        while(true){
            int a = pq.poll();
            total -= a;
            if(a == 1 || total == 1)
                return true;
            if(a < total || total == 0 || a % total == 0)
                return false;
            a %= total;
            total += a;
            pq.add(a);
        }
    }
 */