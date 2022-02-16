package com.MathsforDSA;

public class findUnique {
    public static void main(String[] args) {
        int [] arr = {2,3,3,4,6,5,6,4,2};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique = 0 ;

        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
    //XOR all the numbers
}
