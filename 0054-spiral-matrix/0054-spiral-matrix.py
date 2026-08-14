class Solution:
    def spiralOrder(self, a: List[List[int]]) -> List[int]:
        r=[]
        while a:
            r+=a.pop(0)
            a=list(zip(*a))[::-1]
        return r
        