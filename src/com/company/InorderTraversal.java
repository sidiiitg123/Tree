package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
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

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if (A == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> output = new ArrayList<>();
        TreeNode current = A;
        Stack<TreeNode> mystack = new Stack<>();

        while(A!=null || !mystack.isEmpty()){
            while(A!=null){
                mystack.push(A);
                A=A.left;
            }
            A=mystack.peek();
            mystack.pop();
            output.add(A.val);
            A=A.right;
        }
      return output;
    }
}
