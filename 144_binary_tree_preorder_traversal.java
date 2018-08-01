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
    List<Integer> tree = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return tree;
        traverseTree(root);
        return tree;
    }
    
    void traverseTree(TreeNode root) {
        tree.add(root.val);
        if(root.left != null) 
            traverseTree(root.left);
        
        if(root.right != null)
            traverseTree(root.right);
    }
}