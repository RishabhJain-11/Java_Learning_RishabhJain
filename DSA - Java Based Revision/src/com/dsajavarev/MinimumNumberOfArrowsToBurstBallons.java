package com.dsajavarev;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBallons {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int ans = 1;
        int bound = points[0][1];
        for(int i = 1;i < points.length;i++){
            if(points[i][0] > bound){
                bound = points[i][1];
                ans++;
            }
        }
        return ans;
    }
}
