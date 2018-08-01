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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return tree;
        traverseTree(root);
        return tree;
    }
    void traverseTree(TreeNode root) {
        if(root.left != null) 
            traverseTree(root.left);
        tree.add(root.val);
        if(root.right != null)
            traverseTree(root.right);
    }
}