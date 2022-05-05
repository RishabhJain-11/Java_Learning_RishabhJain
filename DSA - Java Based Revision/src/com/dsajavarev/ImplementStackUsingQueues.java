package com.dsajavarev;
//https://leetcode.com/problems/implement-stack-using-queues/
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {

    }
    private final Queue<Integer> queue = new LinkedList<>();
    public void push(int x) {
        queue.add(x);
        for(int i = 1;i < queue.size();i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
