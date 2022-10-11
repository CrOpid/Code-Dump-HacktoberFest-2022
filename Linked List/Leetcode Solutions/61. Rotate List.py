# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
        
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        b=head
        flag=1
        n=1
        if head==None:
            return head
        while head.next!=None:
            head=head.next
            n+=1
        k=k%n
        head.next=b
        # print(n)
        for i in range(n-k-1):
            b=b.next
        head=b.next
        b.next=None
        return head