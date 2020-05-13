package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeastCommonAncestor {
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
    static boolean v1 = false, v2 = false;

    public TreeNode helper(TreeNode A, int B, int C){
        if(A == null){
            return null;
        }

        TreeNode t = null;

        if(A.val == B){
            v1 = true;
            t = A;
        }
        if(A.val == C){
            v2 = true;
            t = A;
        }

        TreeNode left = helper(A.left,B,C);
        TreeNode right = helper(A.right,B,C);

        if(t!=null){
            return t;
        }

        if(left!=null && right!=null){
            return A;
        }

        return (left!=null) ? left: right;
    }

    public int lca(TreeNode A, int B, int C) {

        v1 = false;
        v2 = false;

        TreeNode ans = helper(A,B,C);

        if(v1 && v2){
            return ans.val;
        }

        return -1;
    }
}
