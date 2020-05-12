package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class BstIterator {
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

    ArrayList<Integer> myarr = new ArrayList<>();
    Stack<Integer> mystack = new Stack<>();

    public void buildArr(TreeNode A, ArrayList<Integer> myarr) {

        if (A == null) {
            return;
        }
        buildArr(A.left, myarr);
        myarr.add(A.val);
        buildArr(A.right, myarr);

    }

    public BstIterator(TreeNode root) {
        buildArr(root, myarr);

        for (int i = myarr.size() - 1; i >= 0; i--) {
            mystack.push(myarr.get(i));
        }
    }

    public boolean hasNext() {
        if (!mystack.isEmpty()) {
            return true;
        }
        return false;
    }

    public int next() {
        return mystack.pop();
    }
}

