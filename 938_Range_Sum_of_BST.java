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
    int result = 0;
    private void traverseBST(TreeNode node, int l, int r) {
        if(node.left != null) traverseBST(node.left, l, r);
        if(node.val >= l && node.val <= r) 
            result += node.val;
        if(node.right != null) traverseBST(node.right, l, r);
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        traverseBST(root, L, R);
        return result;
    }
}