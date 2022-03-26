package com.dsajavarev;

import java.util.ArrayList;

public class DetectACycleInGraph {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj;
//        adj = {{0, 1, 2, 3}};
    }
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfsVis = new boolean[V];

        for(int i = 0;i < V;i++){
            if(!vis[i]){
                if(checkCycle(i, vis, dfsVis, adj))
                    return true;
            }
        }
        return false;
    }
    public static boolean checkCycle(int node, boolean[] vis, boolean[] dfsVis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        dfsVis[node] = true;

        for(Integer it : adj.get(node)){
            if(!vis[it]){
                if(checkCycle(it, vis, dfsVis, adj))
                    return true;
            }
            else if(dfsVis[it])
                return true;
        }
        dfsVis[node] = false;
        return false;
    }
}
