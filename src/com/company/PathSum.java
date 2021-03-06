package com.company;

public class PathSum {
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

    public int hasPathSum(TreeNode A, int B) {

        if(A == null){
            return 0;
        }

        if(A.val == B && A.left == null && A.right == null){
            return 1;
        }

        if(hasPathSum(A.left, B-A.val) == 1 || hasPathSum(A.right, B-A.val) == 1){
            return 1;
        }
        else{
            return 0;
        }

    }
}
