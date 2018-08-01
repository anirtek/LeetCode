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
    List<Integer> postOrderList = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return postOrderList;
        traverseByPostOrder(root);
        return postOrderList;
    }
    
    void traverseByPostOrder(TreeNode node) {
        if(node.left != null)
            traverseByPostOrder(node.left);
        if(node.right != null) 
            traverseByPostOrder(node.right);
        postOrderList.add(node.val);
    }
}