//package com.dsajavarev;
//
//import java.awt.*;
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class InvertBinaryTree {
////    private Insets node;
//
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val){this.val = val; }
//        TreeNode(int val, TreeNode left, TreeNode right){
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public TreeNode invertTree(TreeNode root){
//        if(root == null){
//            return null;
//        }
//        final Deque<TreeNode> stack = new LinkedList<>();
//        stack.push(root);
//
//        while(!stack.isEmpty()){
//            final TreeNode node = stack.pop();
//            final TreeNode left = node.left;
//            node.left = node.right;
//            node.right = left;
//        }
//
////        if(node.left != null){
////            stack.push(node.left);
////        }
////
////        if(node.right != null){
////            stack.push(node.right);
////        }
//        return root;
//    }
//}
//
//
///*
//public class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        while(!stack.isEmpty()) {
//            final TreeNode node = stack.pop();
//            final TreeNode left = node.left;
//            node.left = node.right;
//            node.right = left;
//
//            if(node.left != null) {
//                stack.push(node.left);
//            }
//            if(node.right != null) {
//                stack.push(node.right);
//            }
//        }
//        return root;
//    }
//}
// */