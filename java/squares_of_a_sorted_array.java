// ======================================
// LeetCode Problem: squares of a sorted array
// Language: java
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Synced by: LinkCode
// Date: 9/25/2026, 12:30:13 AM
// ======================================


class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        int [] temp=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(Math.abs(nums[left]) >Math.abs(nums[right]))
            {
                temp[i]=nums[left]*nums[left];
                left++;
            }
            else
            {
                temp[i]=nums[right]*nums[right];
                right--;
            }
        }
        return temp;
    }

    }
