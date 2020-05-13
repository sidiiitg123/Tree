package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class RecoverBST {
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

    ArrayList<Integer> result = new ArrayList<Integer>();
    TreeNode pre = null;
    TreeNode first = null;
    TreeNode second = null;

    public ArrayList<Integer> recoverTree(TreeNode a) {

        recoverTreeHelper(a);
        result.add(first.val);
        result.add(second.val);
        Collections.sort(result);

        return result;
    }

    public void recoverTreeHelper(TreeNode node) {
        if (node == null) {
            return;
        } else {
            recoverTreeHelper(node.left);
            if (pre == null)
                pre = node;
            else {
                if (pre.val > node.val) {
                    if (first == null) {
                        first = pre;
                    }
                    second = node;
                }
                pre = node;
            }

            recoverTreeHelper(node.right);
        }
    }
}
