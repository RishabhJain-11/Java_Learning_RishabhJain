package com.dsajavarev;

public class BestTimeToBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minSoFar  = Integer.MAX_VALUE;

        for (int price : prices) {
            minSoFar = Math.min(minSoFar, price);
            maxProfit = Math.max(maxProfit, price - minSoFar);
        }
        return Math.max(0, maxProfit);
    }
}
