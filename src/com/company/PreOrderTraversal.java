package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        if (A == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> output = new ArrayList<>();
        TreeNode current = A;
        Stack<TreeNode> mystack = new Stack<>();

        mystack.push(current);

        while(!mystack.isEmpty() ){
            current=mystack.peek();
            output.add(current.val);
            mystack.pop();
            if(current.right!=null){
                mystack.push(current.right);
            }
            if(current.left!=null){
                mystack.push(current.left);
            }
        }
        return output;
    }
}
