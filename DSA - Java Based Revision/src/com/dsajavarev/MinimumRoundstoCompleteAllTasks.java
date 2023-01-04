package com.dsajavarev;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundstoCompleteAllTasks {
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(tasks));
    }
    public static int minimumRounds(int[] tasks){
        Map<Integer, Integer> fre = new HashMap();
        for(int task : tasks){
            fre.put(task, fre.getOrDefault(task, 0)+1);
        }
        int minimumRounds = 0;
        for(int count : fre.values()){
            if(count == 1){
                return -1;
            }
            if(count % 3 == 0){
                minimumRounds += count/3;
            }else {
                minimumRounds += count/3 + 1;
            }
        }
        return minimumRounds;
    }
}
