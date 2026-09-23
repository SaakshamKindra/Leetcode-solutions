class Solution:
    def minOperations(self, a, x):
        s=sum(a)-x;l=0;t=0;m=-1
        for r,v in enumerate(a):
            t+=v
            while t>s and l<=r:t-=a[l];l+=1

            if t==s:m=max(m,r-l+1)

        return -1 if m<0 else len(a)-m