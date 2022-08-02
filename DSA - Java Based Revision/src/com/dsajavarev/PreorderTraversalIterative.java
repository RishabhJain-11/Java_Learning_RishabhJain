package com.dsajavarev;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversalIterative {
    static class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.right = new Node(5);
        node.left.left = new Node(4);
        node.right= new Node(3);
        System.out.println(preOrder(node));
    }
    public static ArrayList<Integer> preOrder(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while(node != null || stack.size() > 0){
            while (node != null){
                res.add(node.data);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
