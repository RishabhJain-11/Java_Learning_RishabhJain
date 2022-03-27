package com.dsajavarev;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class WorldLadderOne {
    public static void main(String[] args) {

    }
    ArrayList<ArrayList<Integer>>graph=new  ArrayList<ArrayList<Integer>>(101);
    void Solution()
    {
        for(int i=0;i<=100;i++)
        {
            graph.add(new ArrayList<>());
        }
    }
    void add(int i,int j)
    {
        graph.get(i).add(j);
        graph.get(j).add(i);
    }
    int bfs(int n1,int n2)
    {
        Queue<Integer> pq=new LinkedList<>();
        int[] dist =new int[101];
        dist[n1]=1;
        pq.add(n1);
        while(!pq.isEmpty())
        {
            int x=pq.remove();
            for(int i=0;i<graph.get(x).size();i++)
            {
                int p=graph.get(x).get(i);
                if(dist[p]==0)
                {
                    dist[p]=dist[x]+1;
                    pq.add(p);
                }
                if(p==n2)
                    return dist[n2];
            }
        }
        return 0;
    }
    boolean valid(String s1,String s2)
    {
        int i=0,j=0;
        int cnt=0;
        while(i<s1.length()&&j<s2.length())
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(j);
            if(ch1!=ch2)
                cnt++;
            i++;
            j++;
        }
        if(i!=s1.length()||j!=s2.length())
            return false;
        return cnt==1;
    }
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        int n=wordList.length;
        int n1=-1,n2=-1,p=0;
        for( p=0;p<n;p++)
        {
            if(Objects.equals(wordList[p], startWord))
                break;
        }

        for(int i=0;i<n;i++)
        {
            if(wordList[i].equals(startWord) )
                n1=i;
            if(wordList[i].equals(targetWord) )
                n2=i;
            for(int j=i+1;j<n;j++)
            {
                if(valid(wordList[i],wordList[j]) )
                    add(i,j);
            }
            if(p==n)//if word is not found in dictionary then add it manually
            {
                if(valid(wordList[i],startWord) )
                    add(i,n);
            }
        }
        if(n1==-1)
            n1=n;
        return bfs(n1,n2);
    }
}
