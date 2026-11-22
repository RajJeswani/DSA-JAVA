// ======================================
// LeetCode Problem: minimum size subarray sum
// Language: java
// Link: https://leetcode.com/problems/minimum-size-subarray-sum/
// Synced by: LinkCode
// Date: 11/23/2026, 1:02:38 AM
// ======================================


class Solution {
    public int minSubArrayLen(int target, int[] nums)
     {
        int n=nums.length;
        int l=0;
        int count=0;
        int sum=0;
       int minlength = Integer.MAX_VALUE;
        for(int r=0;r<n;r++)
        {
             sum+=nums[r];
            while(sum>=target)
            {
                if(sum>=target) 
                { minlength=Math.min(r-l+1,minlength);}
                sum-=nums[l];
                l++;
            }
            
        } 
        if(minlength== Integer.MAX_VALUE)
        {
            return 0;
        }
        return minlength;   
    }
}