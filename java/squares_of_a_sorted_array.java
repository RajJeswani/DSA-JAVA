// ======================================
// LeetCode Problem: squares of a sorted array
// Language: java
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Synced by: LinkCode
// Date: 11/14/2026, 5:53:08 PM
// ======================================


class Solution {
    public int[] sortedSquares(int[] nums)
     {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int k=n-1;
        int [] another=new int[n];
        while(left<=right)
        {
            if(Math.abs(nums[left])<Math.abs(nums[right]))
            {
                another[k]=nums[right]*nums[right];
                right--;
                k--;
            }
            else
            {
                another[k]=nums[left]*nums[left];
                left++;
                k--;
            }
        }
        return another;
    }
}