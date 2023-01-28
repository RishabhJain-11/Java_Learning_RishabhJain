package com.dsajavarev;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while(true){
            if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else if(root.val < p.val &&root.val < q.val){
                root =root.right;
            }else {
                return root;
            }
        }
    }
}
