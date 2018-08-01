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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> result = new ArrayList<>();
        if(root == null) return result;
        
        q.add(root);
        while(!q.isEmpty()) {
            long sum = 0, count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()) {
                TreeNode t = q.remove();
                sum += t.val;
                count += 1;
                if(t.left != null) temp.add(t.left);
                if(t.right != null) temp.add(t.right);
            }
            q = temp;
            result.add(sum * 1.0 / count);
        }
        return result;
    }
}