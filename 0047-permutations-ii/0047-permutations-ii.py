class Solution:
    def permuteUnique(self, nums):
        nums.sort()
        res = []

        def bt(path, used):
            if len(path) == len(nums):
                res.append(path[:])
                return

            for i in range(len(nums)):
                if used[i] or (i and nums[i] == nums[i-1] and not used[i-1]):
                    continue
                used[i] = 1
                path.append(nums[i])
                bt(path, used)
                path.pop()
                used[i] = 0

        bt([], [0] * len(nums))
        return res