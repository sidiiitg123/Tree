package com.company;

import java.util.ArrayList;

public class KthSmallest {
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

    public ArrayList<Integer> buildArr(TreeNode A,ArrayList<Integer> myarr) {

        if (A == null) {
        return null;
        }
        buildArr(A.left,myarr);
        myarr.add(A.val);
        buildArr(A.right,myarr);

        return myarr;
    }

    public int kthsmallest(TreeNode A, int B) {

        ArrayList<Integer> myarr = new ArrayList<>();
        buildArr(A,myarr);
        return myarr.get(B-1);
    }
}
