// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 10/20/2026, 8:46:12 AM
// ======================================


class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int left=0;
        int right=1;
        while(right<nums.length)
        {
            if(nums[right]!=0)
        {
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
           
        }   
        right++;
        }
         System.out.println(Arrays.toString(nums));
    }
}