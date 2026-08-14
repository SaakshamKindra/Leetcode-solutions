class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        r = []
        for x, y in intervals:
            if r and x <= r[-1][1]:
                r[-1][1] = max(r[-1][1], y)
            else:
                r.append([x, y])
        return r
        