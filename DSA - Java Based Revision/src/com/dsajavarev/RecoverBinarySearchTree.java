package com.dsajavarev;

public class RecoverBinarySearchTree {
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

    }
    private static TreeNode pre;// previous node
    private static TreeNode first;// first wrong node
    private static TreeNode second;// second wrong node

    public static void recoverTree(TreeNode root) {
        // recursive inorder traversal
        inorder(root);

        // Swap the values of two nodes
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }

    // recursive inorder traversal
    private static void inorder(TreeNode root) {
        if (root == null)
            return;
        // Traverse the left child node
        inorder(root.left);

        if (first == null && pre != null && pre.val > root.val) {
            first = pre;
        }
        if (first != null && pre.val > root.val) {
            second = root;
        }
        pre = root;

        // Traverse the right child node
        inorder(root.right);
    }
}
