package com.dsajavarev;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KeysAndroom {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> rooms =  {{1},{2},{3},{}};
//        System.out.println(canVisitAllRooms(rooms));
    }
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        // At the begginning, we have a todo list 'stack' of keys to use.
        // 'seen' represents at some point we have
        while(!stack.isEmpty()){ // While we have keys...
            int node = stack.pop(); // Get the next key 'node'
            for(int nei : rooms.get(node)) // For every key in room # 'node'...
                if(!seen[nei]){  // ... that hasn't been used yet
                    seen[nei] = true; // mark that we've entered the room
                    stack.push(nei); // add the key to the todo list.
                }
        }

        for(boolean v : seen) // if any room hasn't been visited, return false
            if(!v) return false;
        return true;
    }
}
