package com.javacollectionframework;
import java.util.Comparator;
import java.util.PriorityQueue;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(21);
        pq.offer(12);
        pq.offer(33);
        pq.offer(54);
        pq.offer(25);
        System.out.println(pq);
        pq.poll();
//        System.out.println(pq);
//        System.out.println(pq.peek());



    }

}
