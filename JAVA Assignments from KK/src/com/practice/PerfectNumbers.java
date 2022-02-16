package com.practice;

public class PerfectNumbers {
    static boolean perfect(int n ){
        int sum =1 ;
        for(int i = 2; i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i*i != n)
                {
                    sum = sum + i + n / i;
                }
                else
                {
                    sum = sum +i;
                }
            }
        }
        return sum == n && n != 1;
    }
    public static void main(String[] args) {
        System.out.println("below are all the perfect numbers till 10000");
        for(int n = 2 ; n < 10000;n++){
            if(perfect(n)){
                System.out.println(n+" are perfect numbers .");
            }
        }
    }
}

