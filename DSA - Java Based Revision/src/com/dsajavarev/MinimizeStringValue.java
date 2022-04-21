package com.dsajavarev;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimizeStringValue {
    public static void main(String[] args) {
        String str = "geeks";
        int n = 1;
        System.out.println(minValue(str,n));
    }
    public static int minValue(String str,int n) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        /*Frequency*/
        for (char c : str.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        /*Storing The Freq*/
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (char c : charMap.keySet()) {
            maxQueue.add(charMap.get(c));
        }
        /*Minimising the frequency*/
        while (n-- > 0) {
            int top = maxQueue.poll();
            if (top == 0){
                break;
            }
            top--;
            maxQueue.add(top);
        }

        int sum = 0;
        while (!maxQueue.isEmpty()) {
            Integer data = maxQueue.poll();
            sum += data * data;
        }
        return sum;
    }
}
