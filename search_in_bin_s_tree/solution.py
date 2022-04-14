# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if root == None :
            return None
        if root.val == val:
            return root
        
        act = root
        if root.val> val:
            act = root.left
        else:
            act = root.right
        while act.val != val:
            if act.val < val and act.right != None:
                act = act.right
            elif act.val > val and act.left != None:
                act = act.left
            else:
                break
        return act if (act.val == val) else None
            
        
