package com.practice;

class Solution {
    public int subtractProductAndSum(int n) {
        // Scanner in = new Scanner(System.in);

        // int subtract;
        int sum = 0;
        int product = 1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
            // int subtract = product - sum;
        }
        return product-sum;
    }
}
