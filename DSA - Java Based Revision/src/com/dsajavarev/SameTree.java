package com.dsajavarev;

public class SameTree {
    public static void main(String[] args) {
        int[] p = {1,2,3};
        int[] q = {1,2,3};
//        System.out.println(isSameTree(p, q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){
        //if both p and q are null
        if(p == null && q == null) return true;

        //if one of the nodes is false
        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
