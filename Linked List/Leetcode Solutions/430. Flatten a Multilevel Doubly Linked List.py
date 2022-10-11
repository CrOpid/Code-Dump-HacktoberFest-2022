"""
# Definition for a Node.
class Node:
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""

class Solution:
    def flatten(self, head: 'Optional[Node]') -> 'Optional[Node]':
        self.flat(head)
        return head
        
    def flat(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return head
        while head:
            if head.child:
                temp=head.next
                head.next=head.child
                head.child.prev=head
                head.child=None
                head=self.flat(head.next)
                head.next=temp
                if temp:
                    temp.prev=head
            pre=head
            head=head.next
        return pre