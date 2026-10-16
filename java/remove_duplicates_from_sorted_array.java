// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 10/16/2026, 10:09:50 AM
// ======================================


class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int left=0;
        int right=1;
        while(right<nums.length)
        {
            if(nums[left]==nums[right])
            {
                right++;
            }
            else
            {
                left++;
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                right++;
            }
        }
        
       return left+1;
    }
}