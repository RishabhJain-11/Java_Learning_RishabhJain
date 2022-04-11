package com.dsajavarev;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShiftTwoDGrid {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        System.out.println(shiftGrid(grid,k));
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length,n = grid[0].length;
        int start = m * n - k % (m * n);
        LinkedList<List<Integer>> ans = new LinkedList<>();
        for(int i = start;i < m * n + start;++i){
            int j = i % (m * n),r = j / n,c = j % n;
            if((i - start) % n == 0)
                ans.add(new ArrayList<>());
            ans.peekLast().add(grid[r][c]);
        }
        return ans;
    }
}
