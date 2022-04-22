package com.dsajavarev;

public class DesignHashMap {
//    private static int[] nodes;

    public static void main(String[] args) {
//        {"MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"};
//        [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
    }
    static final ListNode[] nodes = new ListNode[10_000];

    public static void put(int key, int value){
        int i = idx(key);
        if(nodes[i] == null)
            nodes[i] = new ListNode(-1, -1);
        ListNode prev = find(nodes[i], key);
        if(prev.next == null)
            prev.next = new ListNode(key, value);
        else prev.next.val = value;
    }

    public static int get(int key){
        int i = idx(key);
        if(nodes[i] == null)
            return -1;
        ListNode node = find(nodes[i], key);
        return node.next == null ? -1 : node.next.val;
    }

    public static void remove(int key){
        int i = idx(key);
        if(nodes[i] != null){
            ListNode prev = find(nodes[i], key);
            if(prev.next != null)
                prev.next = prev.next.next;
        }
    }

    static int idx(int key){return Integer.hashCode(key) % nodes.length;}

    static ListNode find(ListNode bucket, int key){
        ListNode node = bucket, prev = null;
        for(; node != null && node.key != key; node = node.next)
            prev = node;
        return prev;
    }

    static class ListNode{
        int key, val;
        ListNode next;

        ListNode(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}
