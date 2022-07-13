package com.dsajavarev;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrder((root)));
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        levelOrderHelper(res,root,0);
        return res;
    }

    public static void levelOrderHelper(List<List<Integer>> res,TreeNode root,int level){
        if(root == null)
            return;

        List<Integer> curr;

        if(level >= res.size()){
            curr = new ArrayList<>();
            curr.add(root.val);
            res.add(curr);
        }else {
            curr = res.get(level);
            curr.add(root.val);
        }
        levelOrderHelper(res,root.left,level+1);
        levelOrderHelper(res,root.right,level+1);
    }
}
