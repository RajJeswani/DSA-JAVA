// ======================================
// LeetCode Problem: max consecutive ones
// Language: java
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Synced by: LinkCode
// Date: 11/3/2026, 11:38:32 PM
// ======================================


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int n=nums.length;
        int count=0;
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                count++;
                
            }
            else
            {
                count=0;
            }
        maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}