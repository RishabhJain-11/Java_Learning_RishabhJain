package com.dsajavarev;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalPRN(tokens));
    }
    public static int evalPRN(String[] tokens){
        int a, b;
        Stack<Integer> S = new Stack<Integer>();
        for(String s : tokens){
            switch (s) {
                case "+" -> S.add(S.pop() + S.pop());
                case "/" -> {
                    b = S.pop();
                    a = S.pop();
                    S.add(a / b);
                }
                case "*" -> S.add(S.pop() * S.pop());
                case "-" -> {
                    b = S.pop();
                    a = S.pop();
                    S.add(a - b);
                }
                default -> S.add(Integer.parseInt(s));
            }
        }
        return S.pop();
    }
}
