package com.dsajavarev;
//https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/
import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    public static void main(String[] args) {
//        ["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
    }
    static PriorityQueue<Integer> q;
    static int k;
    public static void KthLargest(int k, int[] a) {
        KthLargestElementInAStream.k = k;
        q = new PriorityQueue<>(k);
        for(int n : a)
            add(n);
    }

    public static void add(int val) {
        if(q.size() < k)
            q.offer(val);
        else if(q.peek() < val){
            q.poll();
            q.offer(val);
        }
    }

}
