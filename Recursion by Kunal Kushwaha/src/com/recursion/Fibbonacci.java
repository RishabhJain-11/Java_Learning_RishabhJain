package com.recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int ans = fibo(8);
        System.out.println(ans);

    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        //the example down is not tail recursion
        return fibo(n-1)+fibo(n-2);
    }
}
/*
How to understand & approach a problem
1]Identify if you can break down problem into smaller problem
2]form the recurrence relation if needed
3]draw the recursive tree
4]About the tree
    *see the flow of function how they are getting in stack
    *identify and focus on left tree calls and right tree calls
    *draw the tree and pointers again and again using pen and paper
    *use a  debugger to see the flow
5]see how the value are returned at each step , see where the function call will come out of , in the end you will come out of the main function
 */