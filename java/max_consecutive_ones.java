// ======================================
// LeetCode Problem: max consecutive ones
// Language: java
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Synced by: LinkCode
// Date: 11/20/2026, 9:37:57 PM
// ======================================


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int maxcount=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]!=0)
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