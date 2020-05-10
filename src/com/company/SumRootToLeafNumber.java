package com.company;

import java.util.ArrayList;

public class SumRootToLeafNumber {

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

    public static int sum = 0, mod = 1003;
    public static void pathSum(TreeNode A, int currSum){
        if(A == null){
            return;
        }
        currSum = (currSum*10 + A.val)%mod;
        if(A.left == null && A.right == null){
            sum = (sum + currSum)%mod;
            return;
        }
        pathSum(A.left, currSum);
        pathSum(A.right, currSum);
    }
    public int sumNumbers(TreeNode A) {
        sum = 0;
        pathSum(A, 0);
        return(sum);
    }
}
