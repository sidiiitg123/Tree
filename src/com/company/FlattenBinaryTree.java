package com.company;

public class FlattenBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode flatten(TreeNode a) {

        if(a == null){
            return a;
        }

        TreeNode cur = a;

        while(cur!=null){

            if(cur.left!=null){
                TreeNode rightMost = cur.left;

                while(rightMost.right!=null){
                    rightMost = rightMost.right;
                }

                rightMost.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }

            cur = cur.right;
        }

        return a;
    }
}
