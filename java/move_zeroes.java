// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 11/13/2026, 8:36:59 PM
// ======================================


class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int left=0;
        int right=left+1;
        int n=nums.length;
        while(right<n)
        {
            if(nums[left]!=0)
            {
                left++;
            }
           if(nums[right]!=0 )
           {
            int temp;
            temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
           }
            right++;

        }           
    }
}