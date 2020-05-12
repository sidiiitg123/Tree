package com.company;

public class SortedArrBST {

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

    public TreeNode helper(int[] A ,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;

        TreeNode node=new TreeNode(A[mid]);

        node.left=helper(A,start,mid-1);
        node.right=helper(A,mid+1,end);

        return node;
    }

    public TreeNode sortedArrayToBST(final int[] A) {

        return helper(A,0,A.length-1);
    }
}
