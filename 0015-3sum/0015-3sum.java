class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> r=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int l=i+1,h=nums.length-1;
            while(l<h){
                int s=nums[i]+nums[l]+nums[h];
                if(s<0)l++;else if(s>0)h--;
                else{r.add(Arrays.asList(nums[i],nums[l++],nums[h--]));while(l<h&&nums[l]==nums[l-1])l++;while(l<h&&nums[h]==nums[h+1])h--;}

            }
        }
        return r;
    }
}