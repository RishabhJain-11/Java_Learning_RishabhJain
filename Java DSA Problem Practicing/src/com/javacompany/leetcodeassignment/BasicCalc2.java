package com.javacompany.leetcodeassignment;

import java.util.Stack;

public class BasicCalc2 {
    public static void main(String[] args) {
        String s = "3+2-8/2";
        System.out.println(calc2(s));
    }

    static int calc2(String s){
        int len ;
        if(s == null || (len = s.length())==0)
            return 0;

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i)-'0';
            }

            if (!Character.isDigit(s.charAt(i))&& ' '!=s.charAt(i)||i==len-1){
                if(sign == '-'){
                    stack.push(-num);
                }
                if(sign == '+'){
                    stack.push(num);
                }
                if(sign == '*'){
                    stack.push(stack.pop()*num);
                }
                if(sign == '/'){
                    stack.push(stack.pop()/num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int re = 0;
        for(int i : stack){
            re+=i;
        }
        return re;
    }
}
