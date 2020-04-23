/*
	Construct Binary Search Tree from Preorder Traversal

	Return the root node of a binary search tree that matches the given preorder traversal.

	(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

	Example 1:

	Input: [8,5,1,7,10,12]
	Output: [8,5,10,1,7,null,12]

	Note: 

	1 <= preorder.length <= 100
	The values of preorder are distinct.
*/

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
    public TreeNode add(TreeNode root,int val){
    if(root == null)
        return new TreeNode(val);
    
    if(val > root.val)
        root.right = add(root.right, val);
    else
        root.left = add(root.left, val);
    return root;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int currVal : preorder)
            root = add(root, currVal);
        return root;
    }
}
