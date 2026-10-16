// ======================================
// LeetCode Problem: squares of a sorted array
// Language: java
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Synced by: LinkCode
// Date: 10/16/2026, 10:37:16 PM
// ======================================


class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int[] result=new int[n];        
        for(int i=n-1;i>=0;i--)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                result[i]=nums[left]*nums[left];
                left++;
            }
            else
            {
                result[i]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}