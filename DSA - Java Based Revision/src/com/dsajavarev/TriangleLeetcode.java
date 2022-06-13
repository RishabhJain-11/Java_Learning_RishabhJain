package com.dsajavarev;

import java.util.List;

public class TriangleLeetcode {
    public static void main(String[] args) {
//        List<List<Integer>> triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
//        System.out.println();
    }
    public static int minimumTotal(List<List<Integer>> triangle){
        int[] A = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1;i >= 0;i--){
            for (int j = 0;j < triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
