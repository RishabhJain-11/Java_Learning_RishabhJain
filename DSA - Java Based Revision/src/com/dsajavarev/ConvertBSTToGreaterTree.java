package com.dsajavarev;

public class ConvertBSTToGreaterTree {
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
    public static TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    public static void convert(TreeNode curr){
        int sum = 0;
        if(curr == null) return;
        convert(curr.right);
        curr.val += sum;
        sum = curr.val;
        convert(curr.left);
    }
}
