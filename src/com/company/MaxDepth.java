package com.company;

public class MaxDepth {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public int maxDepth(TreeNode A) {
        if(A==null){
            return 0;
        }
        return Math.max(maxDepth(A.left),maxDepth(A.right))+1;
    }
}