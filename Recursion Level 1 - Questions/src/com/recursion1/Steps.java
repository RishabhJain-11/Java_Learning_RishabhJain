package com.recursion1;

public class Steps {
    public static void main(String[] args) {

        int n =41;
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num) {

        return helper(num,0);
    }

    private static int helper(int num, int steps) {
        if(num == 0)
            return steps;
        if(num % 2 == 0){
            return helper(num/2,steps+1);
        }
        return helper(num - 1,steps + 1);
    }

}
