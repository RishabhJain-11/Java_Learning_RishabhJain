package com.stackandqueues;

public class CirQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue();
        queue.insert(7);
        queue.insert(3);
        queue.insert(1);
        queue.insert(8);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(33);
        queue.display();
    }
}
