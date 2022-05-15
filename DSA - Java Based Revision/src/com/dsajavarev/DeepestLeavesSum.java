package com.dsajavarev;

//import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class DeepestLeavesSum {
    public class TreeNode {
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
    public int deepestLeavesSum(TreeNode root) {
        int res = 0,i;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            for(i = q.size() - 1,res = 0;i >= 0; --i){
                TreeNode node = q.poll();
                res += node.val;
                if(node.right != null) q.add(node.right);
                if(node.left != null) q.add(node.left);
            }
        }
        return res;
    }
}
