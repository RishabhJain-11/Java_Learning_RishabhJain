package com.dsajavarev;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }
    private final Stack<Integer> input;
    private final Stack<Integer> output;

    public ImplementQueueUsingStacks(){
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }

    public void push(int x){
        input.push(x);
    }
    public int pop(){
        peek();
        return output.pop();
    }

    public int peek(){
        if(output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty(){
        return input.empty() && output.empty();
    }
}
