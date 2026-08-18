class Solution:
    def rotateRight(self, head, k):
        if not head or not head.next: return head
        
        n, cur = 1, head
        while cur.next:
            cur = cur.next
            n += 1
        
        k %= n
        if not k: return head
        
        cur.next = head
        for _ in range(n - k):
            cur = cur.next
        
        head = cur.next
        cur.next = None
        return head