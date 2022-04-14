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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        
        boolean l = false;
        TreeNode act = root;
        if(root.val > val){
            act = root.left;
        }else {
            act = root.right;
        }
        while(act.val != val){
            if(act.val < val && act.right != null){
                act = act.right;
            }else if(act.val > val && act.left != null){
                act = act.left;
            }else {
                break;
            }    
        }
        l = (act.val == val);
        return l ? act : null; 
        
    }
}
