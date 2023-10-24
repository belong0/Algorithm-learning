/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) > 1) 
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    int getTreeHeight(TreeNode node){
        if(node == null) return 0;
        return Math.max(getTreeHeight(node.left), getTreeHeight(node.right))+1;
    }
}

// @lc code=end

