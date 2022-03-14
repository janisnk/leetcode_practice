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
class SolutionImproved {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        int rights = 1;
        int lefts = 1;
        TreeNode ls = root.left;
        TreeNode rs = root.right;
        
        while(ls != null){
            ++lefts;
            ls = ls.left;
        }
        
        while(rs != null){
            ++rights;
            rs = rs.right;
        }
        
        if(lefts == rights){
            return (int)Math.pow(2,lefts)-1;
        }
        
        return (countNodes(root.left) + countNodes(root.right)) + 1;
    
        
    }
}
