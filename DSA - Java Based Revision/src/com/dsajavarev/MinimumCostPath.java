package com.dsajavarev;

import java.util.PriorityQueue;

public class MinimumCostPath {
    public static void main(String[] args) {
        int[][] grid = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}};
        System.out.println(minimumCostPath(grid));
    }
    static class Pair implements Comparable<Pair>
    {
        int x, y, cost;

        Pair(int x, int y, int cost)
        {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }


        public int compareTo(Pair p)
        {
            return cost - p.cost;
        }
    }

    private static boolean inLimits(int x, int y, int n){
        return (x >= 0 && y >= 0 && x < n && y < n);
    }


    //Function to return the minimum cost to react at bottom
    //right cell from top left cell.
    public static int minimumCostPath(int[][] grid)
    {
        // Code here
        int n = grid.length;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0, grid[0][0]));

        boolean[][] visited = new boolean[n][n];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!pq.isEmpty())
        {
            Pair p = pq.poll();

            visited[p.x][p.y] = true;

            for(int i=0; i<4; i++)
            {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if(inLimits(x, y, n) && !visited[x][y])
                {
                    if(x==n-1 && y==n-1) return p.cost + grid[x][y];
                    visited[x][y] = true;

                    pq.add(new Pair(x, y, p.cost + grid[x][y]));

                }
            }
        }

        return -1;

    }
}
