class Solution:
    def mySqrt(self, x: int) -> int:
        r=0
        while (r+1)*(r+1)<=x:r+=1
        return r