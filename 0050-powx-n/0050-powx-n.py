class Solution:
    def myPow(self, x, n):
        if n < 0:
            x, n = 1/x, -n
        r = 1
        while n:
            if n & 1:
                r *= x
            x *= x
            n >>= 1
        return r
        

      