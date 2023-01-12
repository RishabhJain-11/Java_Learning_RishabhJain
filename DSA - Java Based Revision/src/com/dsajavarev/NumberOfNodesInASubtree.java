package com.dsajavarev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfNodesInASubtree {
    public static void main(String[] args) {
         int n = 7;
         int[][] edges = {{0,1},{0,2},{1,4}, {1,5},{2,3},{2,6}};
         String labels = "abaedcd";
        System.out.println(Arrays.toString(countSubTrees(n, edges, labels)));
    }
    public static int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] ans = new int[n];
        List<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for(int[] edge: edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        helper(graph, ans, 0, -1, labels);
        return ans;
    }

    public static int[] helper(List<Integer>[] graph, int[] ans, int cur, int parent, String labels) {
        int[] cnt = new int[26];
        for(int next: graph[cur]) {
            if(next == parent) continue;
            int[] arr = helper(graph, ans, next, cur, labels);
            for(int i = 0; i < 26; i++) {
                cnt[i] = cnt[i] + arr[i];
            }
        }
        char c = labels.charAt(cur);
        cnt[c - 'a']++;
        ans[cur] = cnt[c - 'a'];
        return cnt;
    }
}
