package com.dsajavarev;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class GameWithString {
    public static void main(String[] args) {
        String s = "abccc";
        int k = 1;
        System.out.println(minValue(s,k));
    }
    static int minValue(String s, int k){
        // code here
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        Queue<CharCount> queue = new PriorityQueue<>((a, b) -> b.count-a.count);

        for (Map.Entry<Character, Integer> es:map.entrySet()) {
            queue.offer(new CharCount(es.getKey(), es.getValue()));
        }
        while (!queue.isEmpty() && k-- > 0) {
            CharCount c = queue.poll();
            c.count--;
            queue.offer(c);
        }
        int res = 0;
        while (!queue.isEmpty()) {
            int count = queue.poll().count;
            res += count*count;
        }
        return res;
    }
}

class CharCount {
    char c;
    int count;
    CharCount(char c, int count) {
        this.c = c;
        this.count = count;
    }
    public String toString() {
        return "char: "+c+" count: "+count;
    }
}
