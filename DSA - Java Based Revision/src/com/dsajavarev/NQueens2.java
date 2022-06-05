package com.dsajavarev;

public class NQueens2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalNQueens(n));
    }
    static int count = 0;

    public static int totalNQueens(int n){
        boolean[] cols = new boolean[n];
        boolean[] d1 = new boolean[2*n];
        boolean[] d2 = new boolean[2*n];
        backtracking(0,cols,d1,d2,n);
        return count;
    }
    private static void backtracking(int row, boolean[] cols, boolean[] d1, boolean[] d2, int n) {
        if(row == n)
            count++;

        for (int col = 0; col < n; col++) {
            int id1 = col - row + n;
            int id2 = col + row;
            if(cols[col]||d1[id1]||d2[id2]) continue;

            cols[col] = true;
            d1[id1] = true;d2[id2] = true;
            backtracking(row+1,cols,d1,d2,n);
            cols[col] = false;
            d1[id1] = false; d2[id2] = false;
        }
    }
}
