package com.company;

import java.util.Scanner;

public class ValidSquare {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();

        boolean sq = sqrt(inp);
        System.out.println(sq);

    }

    static boolean sqrt(int n ){
       /* while (n>0){
            if(n*n%n == 0)
                return true;

        }
        return false;*/
        // using binary search
        int low =0,high=n;
        while (low<=high){
            long mid = low + (high - low)/2 ;
            if(mid*mid == n){
                return true;
            }else if(mid*mid < n){
                low = (int) mid+1;
            }else{
                high = (int )mid-1;
            }
        }
        return false;
    }
}
