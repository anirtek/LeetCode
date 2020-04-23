/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxLen = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {        
        maxLen = 1;
        findDepth(root);
        return maxLen - 1;
    }
    
    private int findDepth(TreeNode node) {
        if (node == null) return 0; 
        int leftLen = findDepth(node.left);
        int rightLen = findDepth(node.right);
        maxLen = Math.max(maxLen, leftLen + rightLen + 1);
        return Math.max(leftLen, rightLen) + 1; 
    }
}