class Solution:
    def insert(self, a, new):
        r = []
        for x, y in a:
            if y < new[0]:
                r.append([x, y])
            elif x > new[1]:
                r.append(new)
                return r + a[a.index([x, y]):]
            else:
                new[0] = min(new[0], x)
                new[1] = max(new[1], y)
        return r + [new]