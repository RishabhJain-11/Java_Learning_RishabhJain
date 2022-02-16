package com.recursion1;

public class FcatorialRecursion {
    public static void main(String[] args) {
        int ans = fact(5);//w - c
        System.out.println(ans);//w
    }
    static int fact(int n){//c
        if(n<=1){//w
            return 1;//c
        }

        return n * fact(n-1);//c

    }
}
//the lines with c were correct from my side and the  ones with w were wrong