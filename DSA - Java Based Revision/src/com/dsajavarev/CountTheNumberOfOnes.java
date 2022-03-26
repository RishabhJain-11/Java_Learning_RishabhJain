package com.dsajavarev;

public class CountTheNumberOfOnes {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(findMaxArea(grid));
    }

    static boolean[][] vis;
    public  static int sol(int i,int j,int[][]grid){
        int count = 0;
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || vis[i][j])
            return 0;//a lot of test cases solved over here.

        vis[i][j] = true;

        count++;

        count += sol(i - 1,j,grid);
        count += sol(i + 1,j,grid);
        count += sol(i,j - 1,grid);
        count += sol(i,j + 1,grid);
        count += sol(i - 1,j - 1,grid);
        count += sol(i - 1,j + 1,grid);
        count += sol(i + 1,j + 1,grid);
        count += sol(i + 1,j - 1,grid);
        return count;//this is the count of the number of 1's

    }


    public static int findMaxArea(int[][] grid)
    {
        // Code here
        vis = new boolean[grid.length][grid[0].length];
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(!vis[i][j])
                    ans = Math.max(ans,sol(i,j,grid));
            }
        }
        return ans;
    }
}
