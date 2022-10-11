# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

ans=-float("inf")

def height(node):
    global ans
    if node==None:
        return 0
    lh=height(node.left)
    rh=height(node.right)
    ans=max(ans,lh+rh)
    # print(lh,rh,ans)
    return 1+max(lh,rh)
    
    
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        global ans
        ans=-float("inf")
        height(root)
        return ans