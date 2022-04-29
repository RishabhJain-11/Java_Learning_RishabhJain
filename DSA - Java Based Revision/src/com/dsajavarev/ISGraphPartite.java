package com.dsajavarev;

public class ISGraphPartite {
    public static void main(String[] args) {
        int [][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        for(int i = 0;i < n;i++){
            if(colors[i] == 0 && validColor(graph, colors, 1, i)){
                return false;
            }
        }
        return true;
    }
    public static boolean validColor(int[][] graph,int[] colors,int color,int node){
        if(colors[node] != 0){
            return colors[node] != color;
        }
        colors[node] = color;
        for(int next : graph[node]){
            if(validColor(graph, colors, -color, next)){
                return true;
            }
        }
        return false;
    }
}
