/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // System.out.println("root: " + root + " targetSum: " + targetSum);
        if(root == null) return false;
        int temp = targetSum - root.val;
        if(temp == 0 && (root.left == null && root.right == null)) return true;
        return hasPathSum(root.left,temp) || hasPathSum(root.right, temp);
    }
}
// @lc code=end

