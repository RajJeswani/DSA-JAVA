// ======================================
// LeetCode Problem: 3sum
// Language: java
// Link: https://leetcode.com/problems/3sum/
// Synced by: LinkCode
// Date: 9/19/2026, 8:31:32 PM
// ======================================


class Solution
 {
    public List<List<Integer>> threeSum(int[] nums)
     {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;

                    l++;
                    r--;
                }
                else if(sum>0)
                {
                    r--;
                }
                else
                {
                    l++;                    
                }
            }

        }
        return res;

    }
}