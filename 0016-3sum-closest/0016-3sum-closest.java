class Solution {
    public int threeSumClosest(int[] nums, int target) {
        java.util.Arrays.sort(nums);
        int r = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l =i + 1, h = nums.length - 1;
            while (l <h) {
                int s = nums[i] + nums[l] + nums[h];
                if (Math.abs(s - target) < Math.abs(r - target)) r = s;
                if (s < target) l++;
                else if (s > target) h--;
                else return s;
            }
        }
        return r;
    }
}