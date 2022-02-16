package com.stackandqueues;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(24);
        stack.push(14);
        stack.push(64);
        stack.push(54);
        stack.push(94);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
*/

/*
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q.remove());
        System.out.println(q.remove());
*/
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(32);
        deque.add(78);
        deque.addLast(43);
        System.out.println(deque.remove());
    }
}
