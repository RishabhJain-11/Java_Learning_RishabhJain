package com.dsajavarev;

public class RedOrGreen {
    public static void main(String[] args) {
        int N= 5;
        String S= "RGRGR";
        System.out.println(RedOrGreen(N,S));
    }
    public static int RedOrGreen(int N, String S) {
        //code here
        int green = 0,red = 0;
        for(int i = 0;i < N;i++){
            if(S.charAt(i) == 'G'){
                green++;
            }else{
                red++;
            }
        }
        return Math.min(green,red);
    }
}
