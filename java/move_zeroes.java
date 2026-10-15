// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 10/15/2026, 10:30:43 PM
// ======================================


class Solution 
{
    public void moveZeroes(int[] nums) 
    {
       int left=0;
       int n =nums.length;
       for(int right=0;right<n;right++)
       {
        if(nums[right]!=0)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
        }
       }
      System.out.println(Arrays.toString(nums));    
    }
}