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
    
    // recursive
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<>();
        
        if (root == null) {
            return values;
        }
        
        values.addAll(postorderTraversal(root.left));
        values.addAll(postorderTraversal(root.right));
        values.add(root.val);
        
        return values;
    }
    
    // iterative
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;
        while(curr != null || !stack.empty()) {
            if (curr != null) {
                stack.push(curr);
                values.addFirst(curr.val);
                curr = curr.right;
            }
            else {
                curr = stack.pop();
                curr = curr.left;
            }
        }
        
        return values;
    }
}