package com.company;

public class SymmetricalBT {
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

    public boolean isSymmetric(TreeNode l, TreeNode r){

        if(l == null && r == null){
            return true;
        }
        if(l == null || r == null){
            return false;
        }

        if(l.val == r.val && isSymmetric(l.left,r.right) && isSymmetric(l.right,r.left)){
            return true;
        }
        return false;
    }

    public int isSymmetric(TreeNode A) {

        if(A == null){
            return 1;
        }

        return isSymmetric(A.left, A.right) ? 1:0;
    }
}
