package com.dsajavarev;

import javax.swing.tree.TreeNode;

public class TrimBinarySearchTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args) {
//        TreeNode root = {1,0,2};
        int low = 1, high = 2;
    }
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;

        if(root.val < low) return trimBST(root.right,low,high);
        if(root.val > high) return trimBST(root.left,low,high);

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);

        return root;
    }
}
