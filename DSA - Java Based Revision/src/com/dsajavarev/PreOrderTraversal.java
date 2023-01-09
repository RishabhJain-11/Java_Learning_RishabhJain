package com.dsajavarev;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res){
        if(root != null){
//            res.add(root.val);
//            helper(root.left, res);
//            helper(root.right, res);
        }
    }
}
