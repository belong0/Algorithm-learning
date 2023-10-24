/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start

import java.util.List;

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
    public int maxDepth(TreeNode root) {
        // 后序遍历 递归实现
        // if(root == null){
        //     return 0;
        // }else{
        //     int left = maxDepth(root.left);
        //     int right = maxDepth(root.right);   
        //     return Math.max(left,right)+1;
        // }
        
        //层序遍历 队列实现
        if(root == null) return 0;
        int res = 0;
        List<TreeNode> queue = new LinkedList();
        List<TreeNode> temp = new LinkedList();
        queue.add(root);

        while(! queue.isEmpty()){
            temp = new LinkedList();
            for (TreeNode node : queue) {
                if(node.left!= null) temp.add(node.left);
                if(node.right!= null) temp.add(node.right);
            }
            res+=1;
            queue = temp;
        }

        return res;
        
    }

}
// @lc code=end

