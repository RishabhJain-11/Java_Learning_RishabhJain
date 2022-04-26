package com.dsajavarev;

import java.util.PriorityQueue;

public class MinCostToConnectAllPoints {
    public static void main(String[] args) {

    }
    static class Edge{
        int point1;
        int point2;
        int cost;

        public Edge(int point1, int point2, int cost){
            this.point1 = point1;
            this.point2 = point2;
            this.cost = cost;
        }
    }


        public int minCostConnectPoints(int[][] points) {

            if(points==null || points.length==0)
                return 0;

            int n = points.length;
            boolean[] visited = new boolean[n];

            //we only want n-1 edges if there are n points as we dont want a cycle
            int requiredEdges = n-1;
            int minCost=0;

            //we always want min cost to choose 1st, so lets use minheap based on cost
            PriorityQueue<Edge> minHeap = new PriorityQueue<>((a, b)->a.cost-b.cost);
            int[] coordinate1 = points[0];

            //find all possible paths from 0 to n and add its cost to minHeap
            //here indexes are considered as nodes
            for(int i=1;i<points.length;i++){
                int[] coordinate2 = points[i];
                int cost = Math.abs(coordinate2[0]-coordinate1[0])
                        + Math.abs(coordinate2[1]-coordinate1[1]);
                Edge e = new Edge(0, i, cost);
                minHeap.add(e);
            }

            //lets mark 0 as visited bcz we are gonna start from 0 -> finding minCost to another node
            visited[0]=true;

            //we will check till requiredEdges become 0, as we need know initial value was set to n-1
            while(!minHeap.isEmpty() && requiredEdges>0){
                Edge e = minHeap.poll();
                int point1 = e.point1;
                int point2 = e.point2;
                int cost = e.cost;

                //we took the shortest point and see if its already visited, if not lets explore
                if(!visited[point2]){

                    //add the cost and mark as visited
                    minCost += cost;
                    visited[point2]=true;

                    //now lets explore from point 2 to all other possible nodes
                    for(int i=0;i<n;i++){
                        if(!visited[i]){
                            int distance = Math.abs(points[point2][0]-points[i][0])
                                    + Math.abs(points[point2][1]-points[i][1]);

                            minHeap.add(new Edge(point2, i, distance));
                        }
                    }

                    //after this if loop is executed successfully we know we considered a edges, lets decrement it
                    requiredEdges--;
                }
            }

            return minCost;
        }
    }

