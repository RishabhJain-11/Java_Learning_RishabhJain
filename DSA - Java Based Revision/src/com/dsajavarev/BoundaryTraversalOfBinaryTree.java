package com.dsajavarev;

import java.util.ArrayList;
import java.util.Objects;

public class BoundaryTraversalOfBinaryTree {
     public static class Node {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }
    public static void main(String[] args) {

    }
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList <Integer> boundary(Node root)
    {
        if(root == null)
            return ans;

        if(root.left == null && root.right == null){
            ans.add(root.data);
            return ans;
        }
        ans.add(root.data);
        traverseleft(root.left);
        traverseLeaf(root);
        traverseRight(root.right);

        return ans;
    }

    public void traverseleft(Node root){
        if(root == null)
            return;

        if(root.left == null && root.right == null)
            return;
        ans.add(root.data);

        traverseleft(Objects.requireNonNullElseGet(root.left, () -> root.right));
    }

    public void traverseLeaf(Node root){

        if(root==null)
            return;

        if(root.left == null && root.right == null)
            ans.add(root.data);

        traverseLeaf(root.left);
        traverseLeaf(root.right);

    }

    public void traverseRight(Node root){

        if(root==null) return;

        if(root.left==null&&root.right==null) return;

        traverseRight(Objects.requireNonNullElseGet(root.right, () -> root.left));

        ans.add(root.data);
    }
}
