package com.company;

public class InvertBT {
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


    public TreeNode invertTree(TreeNode A) {

        if(A == null){
            return null;
        }
        else if(A.left == null && A.right == null){
            return A;
        }

        invertTree(A.left);
        invertTree(A.right);

        TreeNode temp = A.right;
        A.right = A.left;
        A.left = temp;

        return A;
    }
}
