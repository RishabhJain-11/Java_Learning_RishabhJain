package com.dsajavarev;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AlienProject {
    public static void main(String[] args) {
        int N = 5,K = 4;
        String[] dict = {"baa","abcd","abca","cab","cad"};
        System.out.println(findOrder(dict,N,K));
    }
    public static String findOrder(String [] dict, int n, int k){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] inorder = new int[k];
        Queue<Integer> que = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < k; i++)
            adj.add(new ArrayList<>());

        for(int i = 1; i < n; i++){
            String str1 = dict[i-1];
            String str2 = dict[i];
            int j = 0;
            while(j < str1.length() && j < str2.length()){
                char c1 = str1.charAt(j);
                char c2 = str2.charAt(j);
                if(c1 != c2){
                    adj.get(c1-'a').add(c2-'a');
                    inorder[c2-'a']++;
                    break;
                }
                j++;
            }
        }

        for(int i = 0; i < k; i++)
            if(inorder[i] == 0)
                que.add(i);

        while(!que.isEmpty()){
            int curr = que.remove();
            char c = (char)(curr+'a');
            ans.append(c);
            for(int e:adj.get(curr)){
                inorder[e]--;
                if(inorder[e] == 0)
                    que.add(e);
            }
        }

        return ans.toString();
    }
}
