package com.company;

import java.util.ArrayList;

public class RootToLeafPathSum {
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

    public void helper(TreeNode A, int B, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> output) {
        if (B == 0 && A.left == null && A.right == null) {
            output.add(new ArrayList<>(temp));
        }
        if (A.left != null) {
            temp.add(A.left.val);
            helper(A.left, B - A.left.val, temp, output);
            temp.remove(temp.size() - 1);
        }
        if(A.right!=null){
            temp.add(A.right.val);
            helper(A.right, B - A.right.val, temp,output);
            temp.remove(temp.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        if (A == null) {
            return output;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(A.val);

        helper(A, B - A.val, temp, output);

        return output;
    }
}
