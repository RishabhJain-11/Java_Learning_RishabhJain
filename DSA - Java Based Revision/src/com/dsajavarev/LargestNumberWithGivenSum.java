package com.dsajavarev;

public class LargestNumberWithGivenSum {
    public static void main(String[] args) {
        int n = 5;
        int sum = 12;
        System.out.println(largestNumber(n,sum));
    }
    static String largestNumber(int n, int sum)
    {
        // add your code here
        if(sum > n * 9){
            return "-1";
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < n;i++){
            if(sum >= 9){
                str.append("9");
                sum -= 9;
            }
            else{
                str.append(sum);
                sum = 0;
            }
        }
        return str.toString();
    }
}
