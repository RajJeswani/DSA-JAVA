// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 9/21/2026, 6:20:49 AM
// ======================================


class Solution 
{
    public void moveZeroes(int[] nums)
     {
        int left=0;
        int right=0;
        for(right=0;right<nums.length;right++)
        {
            if(nums[right]!=0)
            {
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
               left++;

            }
             
        }        
    }
}