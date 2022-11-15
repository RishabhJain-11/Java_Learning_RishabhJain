package com.dsajavarev;

public class CountCompleteTreeNodes {
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
    public int height(TreeNode root){
        return root == null ? -1 : 1 + height(root.left);
    }
    public int countNodes(TreeNode root) {
        int nodes = 0, h = height(root);
        while(root != null){
            if(height(root.right) == h - 1){
                nodes += 1 << h;
                root = root.right;
            }else{
                nodes += 1 << h - 1;
                root = root.left;
            }
            h--;
        }
        return nodes;
    }
}
