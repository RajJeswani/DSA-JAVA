// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 11/21/2026, 12:55:00 PM
// ======================================


class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int left=0;
        for(int right=1;right<nums.length;right++)
        {
            if(nums[right]!=nums[left])
            {
                left++;
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        return left+1;
    }
}