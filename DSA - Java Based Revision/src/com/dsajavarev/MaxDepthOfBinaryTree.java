package com.dsajavarev;

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root){
        int count = 0;
        if(root == null) {
            return count;
        }else {
            return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
        }
    }
}
