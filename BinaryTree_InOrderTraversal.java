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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<>();
        
        if (root == null) {
            return values;
        }
        
        values.addAll(inorderTraveral(root.left));
        values.add(root.val);
        values.addAll(inorderTraveral(root.right));
        
        return values;
    }
    
    // iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;
        while(curr != null || !stack.empty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                values.add(curr.val);
                curr = curr.right;
            }
        }
        
        return values;
    }


}