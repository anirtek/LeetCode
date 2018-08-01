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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        list_by_levels(result, root, 0);
        return result;
    }
    public void list_by_levels(List<List<Integer>> result, TreeNode node, int level) {
        if(node == null) return;
        if(result.size() == level) {
            result.add(0, new ArrayList<Integer>());
        }
        result.get(result.size() - level - 1).add(node.val);
        
        list_by_levels(result, node.left, level+1);
        list_by_levels(result, node.right, level+1);
    }
}
