package com.company;

public class MinDepth {
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

    public int minDepth(TreeNode A) {
        if(A == null) return Integer.MAX_VALUE;
        if(A.right == null && A.left == null) return 1;

        return 1+Math.min(minDepth(A.left),minDepth(A.right));
    }
}
