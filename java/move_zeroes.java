// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 11/20/2026, 12:52:30 AM
// ======================================


class Solution {
    public void moveZeroes(int[] nums) 
    {
         int left=0;
        for(int right=0; right<nums.length;right++)
        {
            if(nums[left]!=0) left++;
            if(nums[right]!=0 && nums[left]==0)
            {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            }
        }    
    }
}