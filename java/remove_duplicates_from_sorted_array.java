// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 11/14/2026, 3:10:57 PM
// ======================================


class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int left=0;
        int n=nums.length;
        for(int right=1;right<n;right++)
        {
            if(nums[right]!=nums[left])
            {
                left++;
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                
            }
        }
        return left+1;
    }
}