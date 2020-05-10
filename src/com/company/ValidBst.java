package com.company;

public class ValidBst {

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

    public boolean isUtil(TreeNode A, int maxvalue, int minvalue) {
        if (A == null) {
            return true;
        }
        if (A.val < maxvalue && A.val > minvalue) {
            if (isUtil(A.left, A.val, minvalue) && isUtil(A.right, maxvalue, A.val))
                return true;
        }
        return false;
    }

    public int isValidBST(TreeNode A) {

        if (isUtil(A, Integer.MAX_VALUE, Integer.MIN_VALUE)){
            return 1;
        }
        return 0;
    }
}
