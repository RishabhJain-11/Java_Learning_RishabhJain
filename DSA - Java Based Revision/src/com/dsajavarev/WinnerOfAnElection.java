package com.dsajavarev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String[] votes = {"john","johnny","jackie","johnny","john",
                "jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john"};
        int n = 3;
        System.out.println(Arrays.toString(winner(votes, n)));
    }
    public static String[] winner(String[] arr, int n)
    {
        // add your code
        String[] result = new String[2];

        HashMap<String,Integer> hm = new HashMap<>();
        for(String s : arr){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else{
                hm.put(s,1);
            }
        }
        int max = 0;
        for(String s : arr){
            if(hm.get(s) > max){
                int temp = max;
                max = hm.get(s);
            }
        }
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(String s : hm.keySet()){
            if(hm.get(s) == max){
                pq.add(s);
            }
        }
        result[0] = pq.peek();
        result[1] = Integer.toString(max);
        return result;
    }
}
