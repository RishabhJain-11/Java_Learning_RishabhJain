package com.dsajavarev;
import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int i : costs){
            if(coins >= i){
                count++;
                coins-=i;
            }
        }
        return count;
    }
}
