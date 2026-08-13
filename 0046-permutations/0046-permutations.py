class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        if not nums: return[[]]
        return [[x]+p for i,x in enumerate(nums) for p in self.permute(nums[:i]+nums[i+1:])]