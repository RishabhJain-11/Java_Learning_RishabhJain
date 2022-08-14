package com.dsajavarev;
//https://www.interviewbit.com/test/2dc678116e/?signature=BAhpA5UsFQ%3D%3D--7b6cbf6da2e4834102c822171cd429b3d8c57751#/java
import java.util.Vector;

public class PowerSwap {
    public static void main(String[] args) {
        int[] a = {8, 6, 11, 7, 15};
        System.out.println(solve(a));
    }
    public static int msb(int n){
        int res = 0;
        while(n > 0){
            n /= 2;
            res++;
        }
        return res;
    }

    public static int solve(int[] A){
        int n = A.length;
        Vector<Vector<Integer>> bit = new Vector<Vector<Integer>>(31);
        for (int i = 0; i < 31; i++) {
            bit.add(i, new Vector<Integer>(0));
        }
        for (int k : A) {
            bit.get(msb(k)).add(k);
        }
        int ans = 1;
        for (int i = 0; i < 31; i++) {
            for (int j = 1; j < bit.get(i).size(); j++) {
                if (bit.get(i).get(j) < bit.get(i).get(j - 1)) {
                    ans = 0;
                    break;
                }
            }
        }
        return ans;
    }
}
