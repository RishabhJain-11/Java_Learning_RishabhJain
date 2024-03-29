package com.dsajavarev;

import java.util.Arrays;

public class WhereWilltheBallFall {
    public static void main(String[] args) {
        int[][] grid = {{-1}};
        System.out.println(Arrays.toString(findBall(grid)));
    }

    public static int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            result[i] = findBallDropColumn(0, i, grid);
        }
        return result;
    }

    public static int findBallDropColumn(int row, int col, int[][] grid) {
        // base case; ball reached the last row
        if (row == grid.length)
            return col;
        int nextColumn = col + grid[row][col];
        if (nextColumn < 0 ||
                nextColumn > grid[0].length - 1 ||
                grid[row][col] != grid[row][nextColumn]) {
            return -1;
        }
        return findBallDropColumn(row + 1, nextColumn, grid);
    }
}
