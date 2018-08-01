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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return root;
        else return pruneTreeRec(root) ? root : null;
    }
    
    private boolean pruneTreeRec(TreeNode node) {
        if(node == null) 
            return false;
        boolean lb = pruneTreeRec(node.left);
        boolean rb = pruneTreeRec(node.right);
        if(!lb)
            node.left = null;
        if(!rb)
            node.right = null;
        return (node.val == 1 || lb || rb);
    }
}