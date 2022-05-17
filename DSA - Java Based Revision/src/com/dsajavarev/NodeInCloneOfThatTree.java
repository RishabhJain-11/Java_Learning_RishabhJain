package com.dsajavarev;

public class NodeInCloneOfThatTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {

    }
    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || original == target)
            return cloned;

        TreeNode res = getTargetCopy(original.left,cloned.left,target);

        if(res != null){
            return res;
        }
        return getTargetCopy(original.right,cloned.right,target);
    }
}
