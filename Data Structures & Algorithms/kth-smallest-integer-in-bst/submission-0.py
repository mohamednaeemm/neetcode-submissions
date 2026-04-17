# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.cnt = 0
        self.result = None
        
        def helper(root):
            if not root or self.result is not None:
                return
            result = helper(root.left)
            self.cnt += 1
            if self.cnt == k:
                self.result = root.val
            result = helper(root.right)
        
        helper(root)
        return self.result
            