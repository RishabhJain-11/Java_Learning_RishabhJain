package com.dsajavarev;
import java.util.ArrayList;
import java.util.List;

public class PossibleBipartition {
    public static void main(String[] args) {

    }
    boolean[] visited;
    boolean[] color;
    boolean res = true;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        color = new boolean[n + 1];
        System.out.println(n);
        for(int i = 1; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] dislike: dislikes){
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }
        for(int i = 1; i < graph.length; i++){
            if(!visited[i]){
                traverse(graph, i);
            }
        }
        return res;
    }

    public void traverse(List<Integer>[] graph, int node){
        if(!res){
            return;
        }
        visited[node] = true;
        for(int edge: graph[node]){
            if(visited[edge]){
                if(color[edge] == color[node]){
                    res = false;
                }
            }else{
                color[edge] = !color[node];
                traverse(graph, edge);
            }
        }
    }
}
