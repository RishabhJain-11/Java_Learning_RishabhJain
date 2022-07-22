package com.dsajavarev;

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    public Node next;
    int key;
    Node left = null,right = null;

    Node(int key){
        this.key = key;
    }
}
public class BinaryTreeRightView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printRightView(root);
    }
    public static void printRightView(Node root){
        if(root == null)
            return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        Node curr = null;

        while (!queue.isEmpty()){
            int size = queue.size();
            int i = 0;

            while (i++ < size){
                curr = queue.poll();

                if(i == size){
                    System.out.print(curr.key + " ");
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
    }
}
