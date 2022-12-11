package com.dsajavarev;

import java.util.LinkedList;
import java.util.Queue;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        char[] stack = new char[s.length()];
        int top = -1;
        for(int i = 0;i < s.length();i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                stack[++top] = curr;
            }else{
                if(top == -1) return false;
                if((stack[top] == '(' && curr ==')')
                        || (stack[top] == '[' && curr ==']')
                        || (stack[top] == '{' && curr =='}')){
                    --top;
                }else{
                    return false;
                }
            }
        }
        return top == -1;
    }
}

/*
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */